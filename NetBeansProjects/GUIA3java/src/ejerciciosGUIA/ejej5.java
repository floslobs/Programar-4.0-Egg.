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
public class ejej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
        el número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
*/
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int num, cont=0;
        do {
            System.out.println("ingrese 4 numeros");
             num = sc.nextInt(); cont++;
             
        } while (cont <= 4 -1);
         
        
        for (int i = 1; i < num+1; i++) {
            System.out.print(i);
             for (int j = 0; j < i; j++) {
                 
                 System.out.print("*");
                
            }
             System.out.println("");
           
           
            }
        }
         
        
        
        
        
        
    }
    

