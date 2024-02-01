/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia13excepciones3;

import Entidades.DivisionNumeros;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author fan1_
 */
public class GUIA13Excepciones3 {

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

        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);

        try {
            int resultado = DivisionNumeros.dividirNumeros(num1, num2);
            System.out.println("El resultado de la división es: " + resultado);
        } catch (Exception e) {
            
        }

    }
}
