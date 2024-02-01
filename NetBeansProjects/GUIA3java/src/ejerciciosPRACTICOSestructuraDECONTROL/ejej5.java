/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosPRACTICOSestructuraDECONTROL;

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
        /*Escriba un programa en el cual se ingrese un valor límite positivo, y a 
        continuación solicite números al usuario hasta que la suma de los números 
        introducidos supere el límite inicial.
*/
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        int valor,num, suma=0;
        
        System.out.println("ingrese un valor limite entero");
        valor = sc.nextInt();
        
        do {
            System.out.println("ingrese numeros");
            num = sc.nextInt();
            suma= suma+ num;
        } while (suma <= valor-1);
        
        
        
        
        
        
        
        
        
        
    }
    
}
