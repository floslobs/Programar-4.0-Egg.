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
public class ejej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Escribir un programa que lea un número entero por teclado y muestre 
        por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
*/
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        int num;
        
        System.out.println("ingrese un numero entero ");
        num = sc.nextInt();

        int doble = num * 2;
        int trip = num * 3;
        double raiz = Math.sqrt(num);

        System.out.println("el doble del numero es: " + doble);
        System.out.println("el triple del numero es: " + trip);
        System.out.println("la raizcuadrada del numero es: " + raiz);


        
        
        
    }
    
}
