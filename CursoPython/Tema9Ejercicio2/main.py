from functools import reduce

lista = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]

impares = list(filter(lambda x: x % 2 != 0, lista))
print(impares)

sumaImpares = reduce(lambda x, y: x + y, impares)
print(sumaImpares)
