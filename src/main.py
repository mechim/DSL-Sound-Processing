from antlr4 import *
from resources.ExprLexer import ExprLexer
from resources.ExprParser import ExprParser
from resources.ExprListener import ExprListener
from pydub import AudioSegment, effects
from pydub.playback import play

# Create a stream of characters from the input string
input_stream = FileStream('input.txt')

# Create a lexer that will identify tokens in the input stream
lexer = ExprLexer(input_stream)

# Create a stream of tokens from the lexer
token_stream = CommonTokenStream(lexer)

# Create a parser that will generate a parse tree from the token stream
parser = ExprParser(token_stream)

# Parse the input string and generate a parse tree
tree = parser.prog()


variables = {}
loaded_sound = ""
current_sound = ""
fx = ()

# p = pyaudio.PyAudio()

# Create a listener to traverse the parse tree
class MyListener(ExprListener):
    
    def enterVariable_declaration(self, ctx:ExprParser.Variable_declarationContext):
        if (ctx.getText().split('=')[1].split('(')[0] == "load"):
            variables[ctx.getText().split('=')[0]] = AudioSegment.from_file(ctx.getText().split('=')[1].split('(')[1].split(')')[0])
        else:
            variables[ctx.getText().split('=')[0]] = variables[ctx.getText().split('=')[1].split('(')[0]]
        pass

    def enterMethod_invocation(self, ctx:ExprParser.Method_invocationContext):
        method_name = ctx.method_name().getText()
        rhs = ctx.getText().split("(")
        lhs = rhs[1].split(")")
        # method_atributes = lhs[0]
        method_atributes = ctx.method_atributes().getText()
        global loaded_sound
        global current_sound

        if method_name == "play":
            audio = variables[method_atributes]
            play(audio) 
           

        if method_name == "repeat":
            audio = variables[method_atributes.split(',')[0]]
            duration = float(method_atributes.split(',')[1])

            variables[method_atributes.split(',')[0]] = audio * (int(duration * 1000 / len(audio)) + 1)

        if method_name == "delay":
            audio = variables[method_atributes.split(',')[0]]
            duration_value = float(method_atributes.split(',')[1])

            silence_segment = AudioSegment.silent(duration = duration_value * 1000)

            variables[method_atributes.split(',')[0]] = silence_segment + audio
            print(method_atributes)
        pass

        if method_name == "fadein":
            audio = variables[method_atributes.split(',')[0]]
            fade_duration  = float(method_atributes.split(',')[1])
            variables[method_atributes.split(',')[0]] = audio.fade_in(fade_duration)

        if method_name == "fadeout":
            audio = variables[method_atributes.split(',')[0]]
            fade_duration  = float(method_atributes.split(',')[1])
            variables[method_atributes.split(',')[0]] = audio.fade_out(fade_duration)

        if method_name == "changepitch":
            audio = variables[method_atributes.split(',')[0]]
            pitch_factor = float(method_atributes.split(',')[1])
            audio_pitch_shifted = audio._spawn(audio.raw_data, overrides={
                "frame_rate": int(audio.frame_rate * pitch_factor)
            })

            variables[method_atributes.split(',')[0]] = audio_pitch_shifted.set_frame_rate(audio.frame_rate)

        if method_name == "setgain":
            audio = variables[method_atributes.split(',')[0]]
            gain_change = float(method_atributes.split(',')[1])
            variables[method_atributes.split(',')[0]] = variables[method_atributes.split(',')[0]] + gain_change

        if method_name == "splice":
            audio = variables[method_atributes.split(',')[0]]
            second_audio = variables[method_atributes.split(',')[1]]
            variables[method_atributes.split(',')[0]] = audio.append(second_audio, crossfade=0)

        if method_name == "layer":
            audio = variables[method_atributes.split(',')[0]]
            second_audio = variables[method_atributes.split(',')[1]]
            variables[method_atributes.split(',')[0]] = audio.overlay(second_audio)

        if method_name == "cut":
            audio = variables[method_atributes.split(',')[0]]

            start = float(method_atributes.split(',')[1]) * 1000
            end = float(method_atributes.split(',')[2]) * 1000
            variables[method_atributes.split(',')[0]] = audio[start:end]






listener = MyListener()

walker = ParseTreeWalker()
walker.walk(listener, tree)
# p.terminate()
