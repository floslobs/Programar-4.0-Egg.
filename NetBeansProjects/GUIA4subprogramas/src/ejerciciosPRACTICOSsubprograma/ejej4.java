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
public class ejej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Crea una aplicación que nos pida un número por teclado y con una función 
        se lo pasamos por parámetro para que nos indique si es o no un número primo,
        debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25
        no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
*/
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("ingrese un numero");
        int num = sc.nextInt();
        primo(num);

    }
    
    
    public static void primo(int num) {
        int cont = 0;
        for (int i = 1; i <= num; i++) {
            
            int aux = num % i;
            
            if (aux == 0) {
                cont = cont + 1;
                
            }
        }
        if (cont <= 2) {
            System.out.println("el numero es primo");
          }  else{
            System.out.println("su numero no es primo");
        }            
        
    }
    
}
