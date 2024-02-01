/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosGUIA;

import java.util.Scanner;

/**
 *
 * @author fan1_
 */
public class ejej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Escriba un programa que valide si una nota está  entre 0 y 10, sino 
        está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
*/
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
       
        
         System.out.println("ingrese nota");
        int nota = sc.nextInt();

        while (( nota< 0 )||(nota>10)) {
            
             System.out.println("ingrese nota");
         nota = sc.nextInt();
       
        }
        
        
        
        
    }
    
}
