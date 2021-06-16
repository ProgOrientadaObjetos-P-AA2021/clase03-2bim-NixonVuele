/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import herencias2.Policia;
import herencias2.Estudiante;
import herencias2.Docente;
import java.util.ArrayList;

/**
 *
 * @author nixon
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante("René", "Elizalde", 33, 100.2);
        Docente doc1 = new Docente("José", "Hincapié", 40, 1000);
        Policia pol1 = new Policia("María", "MENDOZA", 35, "Cabo");
        Estudiante est2 = new Estudiante("Patricia", "Velez", 31, 100.2);
        Docente doc2 = new Docente("Luis", "Alvarez", 38, 1000);
        Policia pol2 = new Policia("ALEX", "Medina", 33, "Cabo");

        //Estudiante:
        ArrayList listaStudent = new ArrayList<>();
        listaStudent.add(est1);
        listaStudent.add(est2);
        //Reporte Estudiante
        ReporteEstudiante reportStudent = new ReporteEstudiante("0001Est",
                listaStudent);
        reportStudent.setPromedioMatricula();
        System.out.println(reportStudent + "\n");

        //Docente
        ArrayList listaDocente = new ArrayList<>();
        listaDocente.add(doc1);
        listaDocente.add(doc2);
        //Reporte docente
        ReporteDocente reporteDocent = new ReporteDocente("0001Doc",
                listaDocente);
        reporteDocent.setPromedioSueldo();
        System.out.println(reporteDocent + "\n");
        //Policia
        ArrayList listaPolice = new ArrayList<>();
        listaPolice.add(pol1);
        listaPolice.add(pol2);
        //Reporte Policia
        ReportePolicia reportePoli = new ReportePolicia("0001Pol", listaPolice);
        reportePoli.setPromedioEdades();
        System.out.println(reportePoli + "\n");

    }
}
