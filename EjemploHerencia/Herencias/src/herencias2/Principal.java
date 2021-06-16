/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.print("====Ingrese la opcion que desea ingresar=====\n"
                + "1.Estudiante\n"
                + "2.Docente\n"
                + "3.Policia\n>");
        opcion = sc.nextInt();
        sc.nextLine();
        System.out.print("\nIngrese el nombre del Usuario:\n> ");
        String nombre = sc.nextLine();
        System.out.print("\nIngrese el Apellido del Usuario:\n> ");
        String apellido = sc.nextLine();
        System.out.print("\nIngrese la edad del Usuario:\n> ");
        int edad = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.print("\nIngrese el valor de la matricula\n> ");
                double matricula = sc.nextDouble();
                Estudiante student = new Estudiante(nombre, apellido, edad,
                        matricula);
                System.out.println(student);
                break;
            case 2:
                System.out.print("\nIngrese el Sueldo de su Usuario\n> ");
                double sueldo = sc.nextDouble();
                Docente teacher = new Docente(nombre, apellido, edad, sueldo);
                System.out.println(teacher);
                break;

            case 3:
                System.out.print("\nIngrese el rango policial\n> ");
                String rang = sc.nextLine();
                Policia police = new Policia(nombre, apellido, edad, rang);
                System.out.println("");
                break;

            default:
                System.out.println("Opcion fuera del rango(1-3)");

        }
        Estudiante e = new Estudiante("René", "Elizalde", 33, 100.2);
        System.out.println(e);
        // Un docente hereda de una Persona y adicionalmente tiene 
        // la característia sueldo
        Docente d = new Docente("Luis", "Alvarez", 40, 12); // falta implementar
        if (d.getSueldo() < 1000) {
            d.setSueldo(1000);
        }
        System.out.println(d);

        // Un policia hereda de una Persona y adicionalmente tiene 
        // la característia rango
        Policia p = new Policia("ALEX", "MENDOZA", 35, "Cabo"); // falta implementar
        System.out.println(p);

    }

}
