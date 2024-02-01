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
public class ejej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Crea una aplicación que le pida dos números al usuario y este pueda elegir
        entre sumar, restar, multiplicar y dividir. La aplicación debe tener una función
        para cada operación matemática y deben devolver sus resultados para imprimirlos en el main. 
*/
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("ingrese dos numeros");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("MENU");
        System.out.println("1.SUMAR");
        System.out.println("2.RESTAR");
        System.out.println("3.MULTIPLICAR");
        System.out.println("DIVIDIR");
        System.out.println("ELIJA OPCION");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.println("la suma es: "+suma(num1,num2));
                break;
                case 2:
                System.out.println("la suma es: "+resta(num1,num2));
                break;
                case 3:
                System.out.println("la suma es: "+multipli(num1,num2));
                break;
                case 4:
                System.out.println("la suma es: "+div(num1,num2));
                
                break;
            default:
                System.out.println("te exediste");;
        }

        
        
    }
    
    public static int suma (int num1, int num2) {
        return num1 + num2;
    }
    public static int resta (int num1, int num2) {
        return num1 - num2;
    }
    public static int multipli (int num1, int num2) {
        return num1 * num2;
    }
    public static double div (double num1, double num2) {
        return num1 / num2;
    }
    
}
