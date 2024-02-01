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
public class concatenarFRASE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String fra;
        do {
            System.out.println("ingrese frase terminada en punto ");
         fra = sc.next();
        } while (!fra.endsWith("."));
        
        tras(fra);
  
    }
    public static void tras(String fra) {
         String aux = "" ;
        for (int i = 0; i < fra.length(); i++) {
           
            switch (fra.substring(i, i+1)) {
                case "a":
                case "A":
                   aux = aux.concat("@");
                    break;
                    case "e":
                case "E":
                     aux = aux.concat("#");
                    
                    break;
                    case "i":
                case "I":
                     aux = aux.concat("$");
                    break;
                    case "o":
                case "O":
                     aux = aux.concat("%");
                    break;
                    case "u":
                case "U":
                     aux = aux.concat("*");
                    
                    break;
                 default:
                    aux = aux.concat(fra.substring(i, i + 1));
            }
        }
        System.out.println(aux);
    
    }
    
}
