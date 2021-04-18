/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorador;

public class Alinear extends Decorador{

    private char alinear;

    public Alinear(Texto iTexto) {
        super(iTexto);
        texto = super.getTexto();
        //System.out.println(texto);
    }
    
    
    
    public void setAlinear(char ta){
        alinear=ta;
    }
    
    @Override
    public String getTexto() {
        int tamañoRenglon=80;
        int numeroEspacios=0;
        String t="";
        if(alinear == 'C' || alinear == 'c'){
            numeroEspacios=(tamañoRenglon - texto.length())/2;
            for(int p=0; p<numeroEspacios ;p++){
                //t.concat(" ");
                t+=" ";
            }
        }
        return t+texto;
    }

    @Override
    public void setTexto(String t) {
    
    }
    
}