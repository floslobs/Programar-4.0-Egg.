/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recordar;

import java.util.Scanner;

/**
 *
 * @author fan1_
 */
public class evaluarunaLETRAdefrase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("ingrese frase");
        String fra = sc.next().substring(0, 1);
        
        if (fra.equalsIgnoreCase("A")) {
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
           
        
    }
    
}
