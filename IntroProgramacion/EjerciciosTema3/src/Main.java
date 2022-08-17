public class Main {
    public static void main(String[] args) {
        //Parte 1
        System.out.println(suma(5,4,3));

        // Parte 2
        Coche miCoche = new Coche();
        System.out.println(miCoche.numeroPuertas);
        miCoche.incrPuertas();
        System.out.println(miCoche.numeroPuertas);
    }

    // Parte 1
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}
