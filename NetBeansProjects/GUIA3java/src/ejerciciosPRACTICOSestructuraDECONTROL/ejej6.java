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
public class ejej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Realizar un programa que pida dos números enteros positivos por teclado
        y muestre por pantalla el siguiente menú:El usuario deberá elegir una opción 
        y el programa deberá mostrar el resultado por pantalla y luego volver al menú.
        El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que,
        si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
        se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir
        del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, 
        caso contrario se vuelve a mostrar el menú.
        MENU
        1.Sumar
        2.Restar
        3.Multiplicar
        4.Dividir
        5.Salir
        Elija opcion:

*/
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        int op, num1, num2;
        String resp = "" ;
        System.out.println("ingrese dos numeros enteros");
        num1=sc.nextInt();
        num2=sc.nextInt();
        do {
            
            System.out.println("MENU");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("Elija opcion");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    int suma = num1 + num2;
                    System.out.println("La suma de los numeros es: "+suma);

                    break;
                case 2:
                    int resta = num1 - num2;
                    System.out.println("La resta de los numeros es: " + resta);

                    break;
                case 3:
                    int multi = num1 * num2;
                    System.out.println("La multiplicacion de los numeros es: ");

                    break;
                case 4:
                    double divi = num1 / num2;
                    System.out.println("La divicion de los numeros es: ");
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                      resp = sc.next();

                    break;

            }
        } while (!resp.equals("S"));


        
        
        
    }
    
}
