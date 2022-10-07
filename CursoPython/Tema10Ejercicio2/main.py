import tkinter as tk
from tkinter import END

window = tk.Tk()

window.columnconfigure(0, weight=1)

listbox = tk.Listbox(window)

for item in ['Uno', 'Dos', 'Tres', 'Cuatro', 'Cinco']:
    listbox.insert(END, item)

listbox.grid(column=0, row=1, padx=5, pady=5, sticky=tk.W)

label = tk.Label(text='Lista de items')
label.grid(column=0, row=0, padx=5, pady=5, sticky=tk.NS)

window.mainloop()
