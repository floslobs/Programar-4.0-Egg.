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
public class evaluaPRIMERyultimaLETRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String texto;
        int conC = 0;
        int conI = 0;
       
        do {
               System.out.println("ingrese texto");
               texto = sc.next();
               if (texto.length()<=5 && texto.startsWith("X") && texto.endsWith("O")) {
                  conC++;
            }else{
                   conI++;
               }
        } while (!texto.equals("&&&&&"));
        System.out.println("textos correcto: " +conC);
        System.out.println("textos incorrectos: " +conI);
    }
    
}
