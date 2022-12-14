package com.marcopdonoso;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
            System.out.print("PRESIONE ENTER PARA VOLVER AL MENU PRINCIPAL");
            pressEnter = scanner.nextLine();
        } while (!pressEnter.equals(""));
    }

    public void saveList() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/marcopdonoso/personalProjects/OpenBootcamp/CursoJavaBasico/EjerciciosTemas789/agenda.properties");
            try {
                properties.clear();
                properties.store(fileOutputStream,null);
                properties.putAll(contactList);
                properties.store(fileOutputStream,null);
                fileOutputStream.close();
                System.out.println("TODOS LOS CAMBIOS EN LA AGENDA FUERON ALMACENADOS CON EXITO");
                pause();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteAll() {
        String entry;
        System.out.println();
        System.out.println("CONFIRME QUE DESEA BORRAR TODA LA AGENDA");
        System.out.println("-> ESCRIBA: SI");
        System.out.println("PARA ELIMINAR TODOS LOS CONTACTOS DE LA AGENDA");
        System.out.print("-> ");
        entry = scanner.nextLine();
        if (entry.equals("SI")) {
            System.out.println("TODOS LOS CONTACTOS FUERON ELIMINADOS");
            contactList.clear();
        } else {
            System.out.println("OPCION NO VALIDA");
        }
        System.out.println();
        pause();
    }

    public void showList() {
        for (String key : contactList.keySet()) {
            System.out.println("Nombre: " + contactList.get(key) + " - Telefono: " + key);
        }
        System.out.println();
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
            System.out.print("Desea modificar el nombre? (Y/N): ");
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
                System.out.println("*** LISTA DE #'s TELEFONICOS QUE COINCIDEN CON LA BUSQUEDA ***");
                for (String key : contactList.keySet()) {
                    if (contactList.get(key).equals(name)) {
                        System.out.println(key);
                    }
                }
            } else {
                System.out.println("EL CONTACTO NO EXISTE EN LA AGENDA");
            }
        } else if (option.equals("2")) {
            System.out.print("INTRODUZCA EL # DE TELEFONO QUE DESEA BUSCAR: ");
            phoneNumber = scanner.nextLine();
            if (contactList.containsKey(phoneNumber)) {
                System.out.println("*** CONTACTO ENCONTRADO ***");
                System.out.println(contactList.get(phoneNumber));
            } else {
                System.out.println("EL # TELEFONICO NO EXISTE EN LA AGENDA");
            }
        } else {
            System.out.println("OPCION NO VALIDA");
        }
        System.out.println();
        pause();
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
                fileInputStream.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
