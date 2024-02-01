/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosPRACTICOSsubprograma;

import java.util.Scanner;

/**
 *
 * @author fan1_
 */
public class ejej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Diseñe una función que pida el nombre y la edad de N personas e imprima 
        los datos de las personas ingresadas por teclado e indique si son mayores o 
        menores de edad. Después de cada persona, el programa debe preguntarle al usuario
        si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
*/
            Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
         String resp;
        do {
            System.out.println("ingrese nombre");
            String nomb = sc.next();
            System.out.println("ingrese edad");
            int edad = sc.nextInt();
            persona(edad);
            System.out.println("desea agreagar persona? S/N");
           resp = sc.next();
            
        } while (!resp.equals("N"));
        
        
        
    }
    
    public static void persona(int edad) {
        if (edad >=18) {
            System.out.println("es mayor");
            
        }else{
            System.out.println(" es menor");
        }
        
        
    }
    
    
    
    
}
