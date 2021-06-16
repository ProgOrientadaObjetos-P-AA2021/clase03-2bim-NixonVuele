/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import herencias2.Docente;
import java.util.ArrayList;

/**
 *
 * @author nixon
 */
public class ReporteDocente extends Reporte {

    private double promedioSueldo;
    private ArrayList<Docente> lista;

    public ReporteDocente(String codDoc, ArrayList listaDocente) {
        super(codDoc);
        this.codigoReporte = codDoc;
        this.lista = listaDocente;
    }

    public void setPromedioSueldo() {
        for (int i = 0; i < lista.size(); i++) {
            this.promedioSueldo = promedioSueldo + lista.get(i).getSueldo();
        }
        this.promedioSueldo = promedioSueldo / lista.size();
    }

    public void setLista(ArrayList<Docente> lista) {
        this.lista = lista;
    }

    public double getPromedioSueldo() {
        return promedioSueldo;
    }

    public ArrayList<Docente> getLista() {
        return lista;
    }

    @Override
    public String toString() {
        String cadena = "--------------Reporte de Docentes----------------";
        cadena = String.format("%s\n- Codigo docente: %s\nLista de docentes:\n",
                cadena, getCodigoReporte());
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s\t> Docente %d : %s\n", cadena, i + 1,
                    lista.get(i).toString());
        }
        cadena = String.format("%s\nEl promedio de sueldos de los "
                + "docentes es de: %.2f$", cadena, getPromedioSueldo());
        return cadena;
    }

}
