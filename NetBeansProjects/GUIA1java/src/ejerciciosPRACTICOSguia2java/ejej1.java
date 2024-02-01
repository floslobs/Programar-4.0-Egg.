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
public class ejej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /*
Escribir un programa que pida dos números enteros por teclado y calcule la suma
        de los dos. El programa deberá después mostrar el resultado de la suma
*/
       
        Scanner sc = new Scanner(System.in).useDelimiter("\n"); 
       int num1;
       int num2;
        System.out.println("ingrese dos numeros enteros ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        int suma = num1 + num2;
        System.out.println("la suma de los numeros es -: "+suma);
        
    }
    
}
