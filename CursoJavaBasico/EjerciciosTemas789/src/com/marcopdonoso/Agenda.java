package com.marcopdonoso;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;
import java.util.Scanner;

public class Agenda {

    Scanner scanner = new Scanner(System.in);
    HashMap<String, String> contactList = new HashMap<>();
    Properties properties = new Properties();


    public void saveList() {
    }

    public void deleteAll() {
    }

    public void showList() {
    }

    public void modifyContact() {
    }

    public void showContact() {
    }

    public void deleteContact() {
    }

    public void newContact() {
        String name;
        String phoneNumber;

        System.out.println();
        System.out.print("Nombre: ");
        name = scanner.next();
        System.out.print("Numero de telefono: ");
        phoneNumber = scanner.next();
        contactList.put(phoneNumber,name);
    }

    public int showMainMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("************************");
        System.out.println("*   AGENDA TELEFONICA  *");
        System.out.println("************************");
        System.out.println();
        System.out.println("1. Crear nuevo contacto");
        System.out.println("2. Eliminar contacto existente");
        System.out.println("3. Ver contacto");
        System.out.println("4. Modificar contacto");
        System.out.println("5. Ver lista completa");
        System.out.println("6. Eliminar lista completa");
        System.out.println("7. Salir y Guardar Lista en archivo .TXT");
        System.out.println("8. Salir sin guardar");
        System.out.println();
        System.out.print("Digite una opcion valida y presione ENTER: ");

        return scanner.nextInt();
    }

    public void readList() {
        try {
            FileInputStream fileInputStream = new FileInputStream("/Users/marcopdonoso/personalProjects/OpenBootcamp/CursoJavaBasico/EjerciciosTemas789/agenda.properties");
            try {
                properties.load(fileInputStream);
                for (String key : properties.stringPropertyNames()) {
                    contactList.put(key,properties.get(key).toString());
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
