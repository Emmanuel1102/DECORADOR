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
    
    
    public static void main (String []args){
    
    

      System.out.print("####################################TEST IZQUIERDA, DERECHA , CENTRO################################ \n");


        Texto textoa = new TextoC("TEST JAVA LEFT");
        Texto ta = new Alinea(textoa, 'l');
        
        Texto textob = new TextoC("TEST JAVA CENTER");
        Texto tb = new Alinea(textob, 'c');
        
        Texto textoc = new TextoC("TEST JAVA RIGHT");
        Texto tc = new Alinea(textoc, 'r');
        
      
        System.out.print(ta.getTexto()+"\n");
        System.out.print(tb.getTexto()+"\n");
        System.out.print(tc.getTexto()+"\n");
//        Texto tb = new Alinea(ta, 'C');
//        System.out.println(tb.getTexto());
        
      System.out.print("####################################TEST VERTICAL################################################### \n");
         
        VerticalText vertical = new VerticalText(new Alinear(new TextoC("COMILLAS NORMALES PARA PROBAR SI SIRVE")));
        System.out.print(vertical.getTexto());
        
      System.out.print("####################################TEST JUSTIFICADO################################################# \n");

        JustificarText j = new JustificarText(new Alinear(new TextoC("Estoy harto de la tierra, de las personas, estoy harto de sentirme atrapado en la maraña que conforman de sus vidas. Dicen que trabajan para crear un paraíso, pero su paraíso está plagado de horrores. Quizá el mundo no se crea, quizá nada se crea, como un reloj sin relojero. Es demasiado tarde, siempre ha sido y siempre será… demasiado tarde.")));
        System.out.println(j.getTexto());
      
       System.out.print("####################################TEXTO IZQUIERDA################################################# \n");
       
       Texto left = new Alinea(new TextoC(vertical.getTexto()),'l');
       System.out.println(left.getTexto()); 
        
       System.out.print("####################################TEXTO DERECHA################################################### \n");

       Texto right = new Alinea(new TextoC(vertical.getTexto()),'r');
       System.out.println(right.getTexto());
       
      System.out.print("####################################TEXTO CENTRO##################################################### \n");
       Texto center = new Alinea(new TextoC(vertical.getTexto()),'c');
       System.out.println(center.getTexto()); 
        
    }
    
}
