//Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array

package com.marcopdonoso;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        int selOpt;
        boolean close = false;

        Agenda agenda = new Agenda();
        agenda.readList();

        while (!close) {
            selOpt = agenda.showMainMenu();
            switch (selOpt) {
                case 1:
                    agenda.newContact();
                    break;
                case 2:
                    agenda.deleteContact();
                    break;
                case 3:
                    agenda.showContact();
                    break;
                case 4:
                    agenda.modifyContact();
                    break;
                case 5:
                    agenda.showList();
                    break;
                case 6:
                    agenda.deleteAll();
                    break;
                case 7:
                    agenda.saveList();
                    close = true;
                    break;
                case 8:
                    close = true;
                    break;
                default:
                    System.out.println("OPCION NO VALIDA.");
                    System.out.println();
            }
        }
    }
}
