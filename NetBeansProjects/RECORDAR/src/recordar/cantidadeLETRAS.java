package recordar;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fan1_
 */
public class cantidadeLETRAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese frase");
        String fra= sc.next();
        int longi= fra.length();
        
        if ((longi==8)) {
            System.out.println("CORRECTO");
            
      
        }else{
            System.out.println("INCORRECTO");
        }
           
    }
    
}
