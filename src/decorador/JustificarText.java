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
public class JustificarText extends Decorador {
    
    public JustificarText(Texto tex) {
        super(tex);
        texto = super.getTexto();
    }

    @Override
    public String getTexto() {
        
        int tamañoRenglon = 100;
        String t = "";
        int c= 0;
        for (int i = 0; i < texto.length(); i++) {
            t += texto.charAt(i);
            c++;
            if (c == tamañoRenglon) {
                t += "\n";
                c = 0;
            }
        }
        return t;
    }

    @Override
    public void setTexto(String t) {

    }
}
