import tkinter
from tkinter import IntVar

window = tkinter.Tk()

window.columnconfigure(0, weight=1)
window.columnconfigure(1, weight=2)

selected = IntVar()


def show_sel():
    label.config(text='Seleccionaste la opción: ' + str(selected.get()))


def reset_options():
    selected.set(None)
    label.config(text='')


rb1 = tkinter.Radiobutton(window, text='Opción 1', variable=selected, value=1, command=show_sel)
rb1.grid(column=0, row=0, sticky=tkinter.W, padx=5, pady=5)

rb2 = tkinter.Radiobutton(window, text='Opción 2', variable=selected, value=2, command=show_sel)
rb2.grid(column=0, row=1, sticky=tkinter.W, padx=5, pady=5)

rb3 = tkinter.Radiobutton(window, text='Opción 3', variable=selected, value=3, command=show_sel)
rb3.grid(column=0, row=2, sticky=tkinter.W, padx=5, pady=5)

label = tkinter.Label(window)
label.grid(column=0, row=3, sticky=tkinter.W)

reset = tkinter.Button(window, text='Reiniciar', command=reset_options)
reset.grid(column=0, row=4, sticky=tkinter.W)

window.mainloop()
