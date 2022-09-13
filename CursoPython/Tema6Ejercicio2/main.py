class Alumno:
    _nombre = ''
    _nota = 0

    def __init__(self, nombre):
        self._nombre = nombre

    def getNota(self):
        return self._nota

    def setNota(self, nota):
        self._nota = nota

    def getNombre(self):
        return self._nombre


alumno1 = Alumno("Pepito")
alumno1.setNota(50)

if alumno1.getNota() >= 51:
    print('El alumno', alumno1.getNombre(), 'ha aprobado la materia con la nota de', alumno1.getNota(), '/100')
else:
    print('El alumno', alumno1.getNombre(), 'ha reprobado la materia con la nota de', alumno1.getNota(), '/100')