/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias2;

/**
 *
 * @author nixon
 */
public class Policia extends Persona {

    private String rango;

    public Policia(String n, String a, int e, String rango) {
        super(n, a, e);
        this.rango = rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getRango() {
        return rango;
    }

    @Override
    public String toString() {

        return String.format("%s - Rango: %s", super.toString(), rango);
    }
}
