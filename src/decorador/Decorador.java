/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorador;

/**
 *
 * @author emman
 */

public abstract class Decorador extends Texto {

    protected Texto iTexto;

    public Decorador(Texto iTexto) {
        this.iTexto = iTexto;
    }

    @Override
    public String getTexto() {
        return iTexto.getTexto();
    }

    @Override
    public void setTexto(String t) {

    }

}