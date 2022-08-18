public class Main {
    public static void main(String[] args) {
        // Ejercicio IF
        int numeroIf = 3;

        if (numeroIf > 0) {
            System.out.println("Es positivo");
        } else if (numeroIf < 0) {
            System.out.println("Es negativo");
        } else {
            System.out.println("Es igual a cero");
        }

        // Ejercicio WHILE
        int numeroWhile = 0;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        // Ejercicio DO-WHILE
        // No asigno nuevo valor menor a 2 a variable numeroWhile, para que se ejecute solo una vez
        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 3);

        // Ejercicio FOR
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        // Ejercicio SWITCH
        String estacion = "PANGOLIN";

        switch (estacion) {
            case "VERANO":
                System.out.println("Es verano");
                break;
            case "INVIERNO":
                System.out.println("Es invierno");
                break;
            case "OTOÑO":
                System.out.println("Es otoño");
                break;
            case "PRIMAVERA":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("El valor NO es una estación");
        }
    }
}
