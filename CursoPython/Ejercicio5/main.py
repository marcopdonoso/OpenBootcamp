def bisiesto(year):
    if year % 400 == 0 or (year % 4 == 0 and year % 100 != 0):
        return True
    return False

year = 2096

if bisiesto(year):
    print('El año',year,'es bisiesto')
else:
    print('El año',year,'no es bisiesto')