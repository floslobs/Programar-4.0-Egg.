/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia13excepciones4;

import Entidades.DivisionNumero;
import java.util.Scanner;

/**
 *
 * @author fan1_
 */
public class GUIA13Excepciones4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
   
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Por favor, introduce el primer número:");
        String num1Str = scanner.next();

        System.out.println("Por favor, introduce el segundo número:");
        String num2Str = scanner.next();

        try {

            int num1 = Integer.parseInt(num1Str);
            int num2 = Integer.parseInt(num2Str);

            int resultado = DivisionNumero.dividirNumeros(num1, num2);

            System.out.println("El resultado de la división es: " + resultado);

        } catch (NumberFormatException e) {
            System.out.println("Por favor, asegúrate de introducir números válidos.");

        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero.");
        }
    }
}