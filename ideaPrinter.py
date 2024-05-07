#!/bin/python3

import time, subprocess
import Tkinter as Tk

file = open("ideas.txt", "r")

try:
    label = Tk.Label(None, text='The text you want to display', font=('Times', '18'),fg='blue')
    label.pack()
    label.mainloop()

#    while True:
#        text = "conky -t"+file.readline()
#        subprocess.call(text, shell=True)
#        time.sleep(3)
except KeyboardInterrupt:
    print('Quitting')

#file.close()
