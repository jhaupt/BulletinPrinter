#!/bin/python3

import time
import tkinter as tk

root = tk.Tk()
root.configure(background='black')
text = tk.Text(root, height=10, width=200)
bulletin = "Here's a good idea for ya. Why don't ya run with it, kiddo."

text.config(foreground='white',
            background='black',
            highlightbackground="black",
            font=('Verdana', 20, 'bold'))


text.insert(tk.END, bulletin)
text.pack(side=tk.LEFT)


root.mainloop()


