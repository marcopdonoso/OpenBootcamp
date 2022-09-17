paises = input('Introduce una lista de países (separados por comas): ')

paises = sorted(set(paises.split(',')))

print(', '.join(paises))
