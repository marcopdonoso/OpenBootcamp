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

    public void pause() {
        String pressEnter;
        do {
            System.out.println("PRESIONE ENTER PARA VOLVER AL MENU PRINCIPAL");
            pressEnter = scanner.nextLine();
        } while (!pressEnter.equals(""));
    }

    public void saveList() {
    }

    public void deleteAll() {
    }

    public void showList() {
        for (String key : contactList.keySet()) {
            System.out.println("Nombre: " + contactList.get(key) + " - Telefono: " + key);
        }
    }

    public void modifyContact() {
        String phoneNumber;
        String name;
        String option;
        System.out.println();
        showList();
        System.out.print("ESCRIBA EL # DE TELEFONO DEL CONTACTO QUE QUIERE MODIFICAR: ");
        phoneNumber = scanner.nextLine();
        if (contactList.containsKey(phoneNumber)) {
            name = contactList.get(phoneNumber);
            System.out.print("Desea modificar el # de Telefono? (Y/N): ");
            option = scanner.nextLine();
            if (option.equals("Y") || option.equals("y")) {
                contactList.remove(phoneNumber);
                System.out.print("INTRODUZCA EL NUEVO # DE TELEFONO: ");
                phoneNumber = scanner.nextLine();
                contactList.put(phoneNumber,name);
                System.out.println("# DE TELEFONO MODIFICADO EXITOSAMENTE");
                System.out.println();
            }
            System.out.print("Desea modificar el nombre? (Y/N)");
            option = scanner.nextLine();
            if (option.equals("Y") || option.equals("y")) {
                System.out.print("INTRODUZCA EL NUEVO NOMBRE PARA EL # " + phoneNumber + ": ");
                name = scanner.nextLine();
                contactList.put(phoneNumber,name);
                System.out.println("NOMBRE MODIFICADO EXITOSAMENTE");
                System.out.println();
            }
        } else {
            System.out.println("ERROR: EL # DE TELEFONO NO EXISTE EN LA AGENDA");
        }
        pause();
    }

    public void showContact() {
        String option;
        String name;
        String phoneNumber;
        System.out.println();
        System.out.print("DESEA BUSCAR POR NOMBRE (1) O POR # DE TELEFONO (2)?: ");
        option = scanner.nextLine();
        if (option.equals("1")) {
            System.out.print("INTRODUZCA EL NOMBRE DEL CONTACTO: ");
            name = scanner.nextLine();
            if (contactList.containsValue(name)) {
                System.out.println("Nombre: " + name + " - Telefono: "); // Resolver lista de claves recorriendo con getKey y llenando un Array.
            }
        }
    }

    public void deleteContact() {
        String phoneNumber;
        System.out.println();
        showList();
        System.out.println();
        System.out.print("ESCRIBA EL # DE TELEFONO DEL CONTACTO QUE QUIERE BORRAR: ");
        phoneNumber = scanner.nextLine();
        if (contactList.remove(phoneNumber) != null) {
            System.out.println("CONTACTO BORRADO EXITOSAMENTE");
        } else {
            System.out.println("ERROR: EL # DE TELEFONO NO EXISTE EN LA AGENDA");
        }
        pause();
    }

    public void newContact() {
        String name;
        String phoneNumber;

        System.out.println();
        System.out.print("Nombre: ");
        name = scanner.nextLine();
        System.out.print("Numero de telefono: ");
        phoneNumber = scanner.nextLine();
        if (!contactList.containsKey(phoneNumber)) {
            contactList.put(phoneNumber, name);
            System.out.println("Contacto creado exitosamente");
        } else {
            System.out.println("EL # DE TELEFONO YA EXISTE, NO SE PUEDE CREAR MAS DE UN CONTACTO CON EL MISMO #.");
        }
        System.out.println();
        pause();
    }

    public String showMainMenu() {
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
        System.out.println("7. Guardar cambios en AGENDA.PROPERTIES");
        System.out.println("8. Salir");
        System.out.println();
        System.out.print("Digite una opcion valida y presione ENTER: ");

        return scanner.next();
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
