import sqlite3


def main():

    """print('REGISTRO DE ALUMNOS')
    for i in range(8):
        id = i
        nombre = input('NOMBRE: ')
        apellido = input('APELLIDO: ')
        insertar_dato(id, nombre, apellido)"""

    nombre = input('BUSQUEDA POR NOMBRE: ')
    data = buscar_alumno(nombre)

    if data == None:
        print('Alumno no encontrado')
    else:
        print('ID:', data[0], '\nNombre:', data[1], '\nApellido:', data[2])


def insertar_dato(id, nombre, apellido):
    conn = sqlite3.connect('mydatabase.db')
    cursor = conn.cursor()

    query = f'INSERT INTO alumnos(id, nombre, apellido) VALUES({id}, "{nombre}", "{apellido}")'

    cursor.execute(query)

    conn.commit()
    cursor.close()
    conn.close()


def buscar_alumno(nombre):
    conn = sqlite3.connect('mydatabase.db')
    cursor = conn.cursor()

    query = f'SELECT id, nombre, apellido FROM alumnos WHERE nombre="{nombre}"'

    rows = cursor.execute(query)
    data = rows.fetchone()

    cursor.close()
    conn.close()

    return data


if __name__ == "__main__":
    main()
