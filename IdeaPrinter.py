#!/bin/python3

import time
import tkinter as tk
from tkinter import Text, filedialog

root = tk.Tk()


def forecast():
    print("My Forecast")
    label['text'] = "My Forecast"


def models():
    print("Models selected. ")
    label['text'] = "Models selected. "


canvas = tk.Canvas(root, height=480, width=640, bg='black')
canvas.pack()

frame = tk.Frame(root, bg='black')
frame.place(relwidth=0.6, relheight=0.6, relx=0.1, rely=0.1)
label = tk.Label(frame, fg='white', bg='black')
label.pack()
forecast = tk.Button(root, text="Forecasts", padx=2, pady=3,
                     fg='white', bg="red", command=forecast)
forecast.pack()

models = tk.Button(root, text="Models", padx=2, pady=3,
                   fg='white', bg="red", command=models)
models.pack()

tk.mainloop()
