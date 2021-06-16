/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import herencias2.Policia;
import java.util.ArrayList;

/**
 *
 * @author nixon
 */
public class ReportePolicia extends Reporte {

    private int promedioEdades;
    private ArrayList<Policia> lista;

    public ReportePolicia(String codPol, ArrayList listaPolice) {
        super(codPol);
        this.codigoReporte = codPol;
        this.lista = listaPolice;
    }

    public void setPromedioEdades() {
        for (int i = 0; i < lista.size(); i++) {
            promedioEdades = promedioEdades + lista.get(i).getEdad();

        }
        this.promedioEdades = promedioEdades / lista.size();
    }

    public void setLista(ArrayList<Policia> lista) {
        this.lista = lista;
    }

    public int getPromedioEdades() {
        return promedioEdades;
    }

    public ArrayList<Policia> getLista() {
        return lista;
    }

    @Override
    public String toString() {
        String cadena = "--------------Reporte Policial----------------";
        cadena = String.format("%s\n- Codigo policial: %s\nLista de policias:"
                + "\n", cadena, getCodigoReporte());
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s\t> Policia %d : %s\n", cadena, i + 1,
                    lista.get(i).toString());
        }
        cadena = String.format("%s\nEl promedio de edad de los "
                + "policias es de: %d", cadena, getPromedioEdades());
        return cadena;
    }
}
