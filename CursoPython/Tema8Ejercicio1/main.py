def escribir(archivo, modo, datos):
    f = open(archivo, modo)

    for dato in datos:
        if not dato.endswith('\n'):
            dato += '\n'

        f.write(dato)

    f.close()


def leer(archivo):
    f = open(archivo)
    datos = f.readlines()
    f.close()
    return datos


def main():
    datos1 = [
        'primera linea',
        'segunda linea',
        'tercera linea'
    ]

    datos2 = [
        'cuarta linea',
        'quinta linea',
        'sexta linea'
    ]
    escribir('archivo.txt', 'w', datos1)
    escribir('archivo.txt', 'a', datos2)
    datos = leer('archivo.txt')

    for dato in datos:
        print(dato)


if __name__ == '__main__':
    main()