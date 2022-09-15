import operaciones as op


def main():
    a = 12
    b = 4

    print('Suma:', a, '+', b, '=', op.sumar(a, b))
    print('Resta:', a, '-', b, '=', op.restar(a, b))
    print('Multiplicación:', a, '*', b, '=', op.multiplicar(a, b))
    print('División:', a, '/', b, '=', op.dividir(a, b))


if __name__ == '__main__':
    main()