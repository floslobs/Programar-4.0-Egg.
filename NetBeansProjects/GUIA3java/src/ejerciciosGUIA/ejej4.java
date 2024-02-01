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
public class ejej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Escriba un programa que lea 20 números. Si el número leído es igual a 
        cero se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". 
        El programa deberá calcular y mostrar el resultado de la suma de los números leídos,
        pero si el número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
*/
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int cont=0;
        int suma=0;
         int num ;
        do {
            System.out.println("ingrese numero");
             num = sc.nextInt(); cont++;//contamos la cantidad de numeros ingresados
             if (num>0) {
                
            
            suma = suma+num; // sumamos los numeros ingresados
          }
            
        } while ((num !=0) && (cont <= 20 -1));//ponemos la condicion de q se ejecute hasta q el numero sea 0
                                               //y hata q la canidad de numero ingresados sean 20
        System.out.println("se capturo el numero 0");
        System.out.println("la suma de los numeros es: " +suma);
    }
    
}
