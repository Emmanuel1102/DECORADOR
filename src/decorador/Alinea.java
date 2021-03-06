/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorador;


public class Alinea extends Decorador {

    private char alinear;

    public Alinea(Texto tex, char ta) {
        super(tex);
        texto = super.getTexto();
        alinear = ta;

    }

    @Override
    public String getTexto() {
        int tamañoRenglon = 95;
        int numeroEspacios = 0;
        String t = "";
        String[] split = texto.split("\n");

        switch (alinear) {
            case 'C':
            case 'c':
                
                //OPCION 2    t = String.format("%50s", texto);

            for (String tex : split) {
                numeroEspacios = (tamañoRenglon - tex.length()) / 2;
                for (int p = 0; p < numeroEspacios; p++) {
                    t += " "; 
                }
                 t = t + tex + "\n";
            }

             break;
                
            case 'L':
            case 'l':
                t = String.format("%1s", texto);
                break;
                
            case 'R':
            case 'r':
                              //OPCION 2   t = String.format("%100s", texto);

              for (String tex: split) {
                numeroEspacios = tamañoRenglon - tex.length();
                for (int p = 0; p < numeroEspacios; p++) {
                    t += " "; 
                }
                t = t + tex + "\n";

                }
                 
            
                
                
                

                break;
            default:
                break;
        }
        return t ;
    }

    @Override
    public void setTexto(String t) {
    
    }

}