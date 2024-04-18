#Library, which convert text to speech
import pyttsx3

#Initiliaze text to speech
sample = pyttsx3.init()

#set properties (optional)
sample.setProperty('rate',100)
sample.setProperty('volume',0.9)

#Say something
sample.say("Enter your text here")

#wait for the speech to finish
sample.runAndWait()