import pickle


class Vehicle:
    brand = ''
    model = ''
    year = 0

    def __init__(self, brand, model, year):
        self.brand = brand
        self.model = model
        self.year = year

    def __str__(self):
        return f'El vehiculo es un {self.brand}, modelo {self.model}, de año {self.year}'


def main():
    vehiculo1 = Vehicle('Changan', 'CS35', 2015)
    f = open('vehiculo.bin', 'wb')
    pickle.dump(vehiculo1, f)
    f.close()

    f = open('vehiculo.bin', 'rb')

    vehiculocopia = pickle.load(f)
    print(vehiculocopia)


if __name__ == '__main__':
    main()
