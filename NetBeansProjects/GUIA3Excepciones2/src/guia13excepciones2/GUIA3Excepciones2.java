/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia13excepciones2;

/**
 *
 * @author fan1_
 */
public class GUIA3Excepciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here    int[] numeros = new int[2];
        int[] numeros = new int[2];
        try {
            for (int i = 0; i < 3; i++) {
                numeros[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Fuera de rango");
        }
    }

}
