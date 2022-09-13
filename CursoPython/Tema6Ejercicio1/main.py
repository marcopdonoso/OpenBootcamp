class Vehiculo:
    _color = ""
    _ruedas = 0
    _puertas = 0

    def getColor(self):
        return self._color

    def setColor(self, color):
        self._color = color

    def getRuedas(self):
        return self._ruedas

    def setRuedas(self, nroRuedas):
        self._ruedas = nroRuedas

    def getPuertas(self):
        return self._puertas

    def setPuertas(self, nroPuertas):
        self._puertas = nroPuertas


class Coche(Vehiculo):
    _velocidad = 0
    _cilindrada = 0

    def getVelocidad(self):
        return self._velocidad

    def setVelocidad(self, velocidad):
        self._velocidad = velocidad

    def getCilindrada(self):
        return self._cilindrada

    def setCilindrada(self, cilindrada):
        self._cilindrada = cilindrada


miCoche = Coche()
miCoche.setColor("Rojo")
miCoche.setRuedas(4)
miCoche.setPuertas(3)
miCoche.setVelocidad(120)
miCoche.setCilindrada(1800)

print('Datos del Coche')
print('Color:', miCoche.getColor())
print('Nro de Ruedas:', miCoche.getRuedas())
print('Nro de Puertas:', miCoche.getPuertas())
print('Velocidad:', miCoche.getVelocidad())
print('Cilindrada:', miCoche.getCilindrada())