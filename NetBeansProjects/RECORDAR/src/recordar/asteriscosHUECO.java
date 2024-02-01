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
public class asteriscosHUECO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("ingrese dimencion del cuadrado");
        int dim = sc.nextInt();
        
        for (int i = 0; i < dim; i++) {
            
            for (int j = 0; j < dim; j++) {
                if (i == 0 || i == dim - 1 || j == 0 || j == dim - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
                
         
        }
    }
    
}
