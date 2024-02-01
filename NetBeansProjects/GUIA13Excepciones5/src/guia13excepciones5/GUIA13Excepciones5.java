/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia13excepciones5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author fan1_
 */
public class GUIA13Excepciones5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Random random = new Random();
        int aleatorio = random.nextInt(500) + 1;
        boolean noAdivina = true;
        int intentos = 0;
        int adivinar = 0;
        do {
            System.out.println("Ingresa un número entre 1 y 500 para adivinar");
            intentos++;
            try {
                String adivino = leer.next();
                adivinar = Integer.parseInt(adivino);
                if (adivinar > aleatorio) {
                    System.out.println("Te pasaste!!");
                } else if (adivinar < aleatorio) {
                    System.out.println("Todavía te falta!");
                } else {
                    System.out.println("Adivinaste!!");
                    noAdivina = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("NO se ingresó un número");
            }
        } while (noAdivina);
        System.out.println("Se intentó adivinar " + intentos + " veces!!");
    }
}
