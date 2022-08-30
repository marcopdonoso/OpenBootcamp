package com.marcopdonoso;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        // Dada la función:
        //
        // public static String reverse(String texto) { }
        //
        // Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".

        System.out.println(reverse("Hola Mundo"));

        // Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.

        String[] arrayUnidim = {"Hola", "Mundo", "Como", "Estas"};

        for (String valor : arrayUnidim) {
            System.out.print(valor);
        }

        System.out.println();

        // Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.

        int[][] arrayBiDim = new int[2][2];

        arrayBiDim[0][0] = 2;
        arrayBiDim[0][1] = 8;
        arrayBiDim[1][0] = 24;
        arrayBiDim[1][1] = 50;

        for (int i = 0; i < arrayBiDim.length; i++) {
            for (int j = 0; j < arrayBiDim[i].length; j++) {
                System.out.println("Posicion: " + i + " " + j + " Valor: " + arrayBiDim[i][j]);
            }
        }

        // Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.

        Vector<Integer> vectorInt = new Vector<>(5);

        vectorInt.add(2);
        vectorInt.add(4);
        vectorInt.add(6);
        vectorInt.add(8);
        vectorInt.add(10);

        System.out.println(vectorInt);

        vectorInt.remove(1);
        vectorInt.remove(1);

        System.out.println(vectorInt);

        //Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.

        //R.- El problema es que al sobrepasar los 1000 elementos, desde el elemento 1001, la capacidad del vector se duplicará con la posibilidad de desperdiciar la memoria.

        //Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.

        List<String> arrayString = new ArrayList<>(4);

        arrayString.add("Uno");
        arrayString.add("Dos");
        arrayString.add("Tres");
        arrayString.add("Cuatro");

        List<String> linkedString = new LinkedList<>(arrayString);

        for (String anStr : arrayString) {
            System.out.print(anStr + " ");
        }
        System.out.println();

        for (String anStr : linkedString) {
            System.out.print(anStr + " ");
        }
        System.out.println();

        //
        //Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.

        List<Integer> arrayInt = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrayInt.add(i + 1);
        }

        for (int i = 0; i < arrayInt.size(); i++) {
            if (arrayInt.get(i) % 2 == 0) {
                arrayInt.remove(i);
            }
        }

        for (int anInt : arrayInt) {
            System.out.print(anInt + " ");
        }

        System.out.println();

        //
        //Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".

        try {
            dividePorCero(5,0);
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }

        //
        //Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".

        try {
            copiarFichero("/Users/marcopdonoso/personalProjects/OpenBootcamp/CursoJavaBasico/EjerciciosTemas789/file.txt","/Users/marcopdonoso/personalProjects/OpenBootcamp/CursoJavaBasico/EjerciciosTemas789/copia.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //
        //Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.

        

    }

    public static String reverse(String texto) {
        char[] textoChars = texto.toCharArray();
        char[] textoCharsInvert = new char[textoChars.length];
        int j = 0;
        for (int i = textoChars.length - 1; i >= 0 ; i--) {
            textoCharsInvert[j] = textoChars[i];
            j++;
        }
        return new String(textoCharsInvert);
    }

    public static void dividePorCero(int a, int b) throws ArithmeticException {
        System.out.println(a / b);
    }

    public static void copiarFichero(String fileIn, String fileOut) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(fileIn);
        PrintStream printStream = new PrintStream(fileOut);

        byte[] datos = fileInputStream.readAllBytes();

        for (byte anByte : datos) {
            printStream.print((char)anByte);
        }
    }
}
