import time

timeTuple = time.localtime()

print('Son las', timeTuple[3], ':', timeTuple[4])

if timeTuple[6] == 6 or timeTuple[6] == 5:
    print('Es Fin de semana... a descanzar amig@! :)')
else:
    if timeTuple[3] >= 19:
        print('Hora de ir a casa, yeah =)')
    elif 8 <= timeTuple[3] < 19:
        print('Quedan', 19 - timeTuple[3], 'horas para ir a casa')
