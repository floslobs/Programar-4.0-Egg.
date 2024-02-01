/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosPRACTICOSguia2java;

import java.util.Scanner;

/**
 *
 * @author fan1_
 */
public class ejej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Dada una cantidad de grados centígrados se debe mostrar su equivalente 
        en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
*/
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        double grados;
        
        System.out.println("ingrese la cantidad de grados centigrados ");
        
        grados = sc.nextDouble();
        
        double f = 32 + (9 * grados / 5);
        
        System.out.println("los grados centigrados ingresados convertidos en grados fahrenheit son : " + f);
        
        
        
        
    }
    
}
