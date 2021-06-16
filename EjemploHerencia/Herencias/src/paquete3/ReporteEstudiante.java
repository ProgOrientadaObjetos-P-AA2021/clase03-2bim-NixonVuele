/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import herencias2.Estudiante;
import java.util.ArrayList;

/**
 *
 * @author nixon
 */
public class ReporteEstudiante extends Reporte {

    private double promedioMatricula;
    private ArrayList<Estudiante> lista;

    public ReporteEstudiante(String codStudent, ArrayList<Estudiante> listastudent) {
        super(codStudent);
        this.codigoReporte = codStudent;
        this.lista = listastudent;
    }

    public void setPromedioMatricula() {
        for (int i = 0; i < lista.size(); i++) {
            promedioMatricula = promedioMatricula
                    + lista.get(i).getMatricula();
        }
        this.promedioMatricula = promedioMatricula / lista.size();
    }

    public void setLista(ArrayList<Estudiante> lista) {
        this.lista = lista;
    }

    public double getPromedioMatricula() {
        return promedioMatricula;
    }

    public ArrayList<Estudiante> getLista() {
        return lista;
    }

    @Override
    public String toString() {
        String cadena = "--------------Reporte de Estudiantes----------------";
        cadena = String.format("%s\n- Codigo Estudiantil: %s\nLista de "
                + "estudiantes:\n", cadena, getCodigoReporte());
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s\t> Estudiante %d : %s\n", cadena, i + 1,
                    lista.get(i).toString());
        }
        cadena = String.format("%s\nEl promedio de la matricula de los "
                + "estudiantes es de: %.2f$", cadena, getPromedioMatricula());
        return cadena;
    }

}
