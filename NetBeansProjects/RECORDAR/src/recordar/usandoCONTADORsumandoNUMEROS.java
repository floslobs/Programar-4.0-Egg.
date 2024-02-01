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
public class usandoCONTADORsumandoNUMEROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
