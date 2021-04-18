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
public class PruebaDecorador {
    
    
    public static void main (String s[]){
    
    
//    Texto textob = new TextoC();
//    textob.setTexto("EJEMPLO DECORADOR");
//    System.out.print("TEST-->"+textob.getTexto());
//    
//    Alinear ta = new Alinear(textob);
//    ta.setAlinear('c');
//    System.out.print(ta.getTexto());


        Texto textob = new TextoC("TEST JAVA");
         Alinear ta = new Alinear(textob);
         ta.setAlinear('c');
        System.out.print(ta.getTexto());
         
         
        VerticalText v = new VerticalText(new Alinear(new TextoC("ANTONIO HERMOSO BLAS")));
        System.out.print(v.getTexto());
    }
    
}
