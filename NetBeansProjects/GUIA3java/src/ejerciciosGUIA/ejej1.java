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
public class ejej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Implementar un programa que le pida dos números enteros al usuario y
        determine si ambos o alguno de ellos es mayor a 25.*/
        
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        int num1;
        int num2;
        
        System.out.println("ingrese dos numeros enteros ");
        
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        if (((num1 > 25) && (num2 > 25))) {
                System.out.println(" ambos numeros son mayores que 25");
        if ((num1 > 25) || (num2 > 25)) {
            System.out.println("uno de ellos es mayor a 25");
            
            }
            
        }        
        
    }
    
   
}
