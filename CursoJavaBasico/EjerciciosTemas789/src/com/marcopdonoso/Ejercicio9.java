//Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array

package com.marcopdonoso;

public class Ejercicio9 {
    public static void main(String[] args) {

        String mainOption;
        boolean exit = false;

        Agenda agenda = new Agenda();
        agenda.readList();

        while (!exit) {
            mainOption = agenda.showMainMenu();
            System.out.println();
            switch (mainOption) {
                case "1":
                    agenda.newContact();
                    break;
                case "2":
                    agenda.deleteContact();
                    break;
                case "3":
                    agenda.showContact();
                    break;
                case "4":
                    agenda.modifyContact();
                    break;
                case "5":
                    agenda.showList();
                    agenda.pause();
                    break;
                case "6":
                    agenda.deleteAll();
                    break;
                case "7":
                    agenda.saveList();
                    break;
                case "8":
                    exit = true;
                    break;
                default:
                    System.out.println("OPCION NO VALIDA.");
                    System.out.println();
            }
        }
    }
}
