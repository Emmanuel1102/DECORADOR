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

public class VerticalText extends Decorador {

    public VerticalText(Texto iTexto) {
        super(iTexto);
        texto = super.getTexto();
    }

  @Override
    public String getTexto() {
       
        
       texto= texto.replaceAll(" ", "\n");        
        return texto +"\n";
    }

    @Override
    public void setTexto(String t) {

    }

    
    }
