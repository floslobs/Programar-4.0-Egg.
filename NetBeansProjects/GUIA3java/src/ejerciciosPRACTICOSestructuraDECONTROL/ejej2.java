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
public class ejej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Crear un programa que pida una frase y si esa frase es igual a “eureka” 
        el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
        Nota: investigar la función equals() en Java.
*/
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("ingrese una frase ");
        String fra = sc.next();
        
        if (fra.equals("eureka")) {
            System.out.println("CORRECTO");
            
        }else{
            System.out.println("INCORRECTO");
        }
        
        
        
        
    }
    
}
