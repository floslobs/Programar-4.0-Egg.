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
public class numeroPRIMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
