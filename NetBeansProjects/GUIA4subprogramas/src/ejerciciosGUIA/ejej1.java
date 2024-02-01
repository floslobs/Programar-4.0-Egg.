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
public class ejej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Escribir un programa que procese una secuencia de caracteres ingresada por teclado
        y terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente 
        manera: cada vocal se reemplaza por el carácter que se indica en la tabla y el resto 
        de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
aeiou
@#$%*

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
        correspondiente. Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
*/
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String fra;
        do {
            System.out.println("ingrese frase terminada en punto ");
         fra = sc.next();
        } while (!fra.endsWith("."));
        
        tras(fra);
  
    }
    public static void tras(String fra) {
         String aux = "" ;
        for (int i = 0; i < fra.length(); i++) {
           
            switch (fra.substring(i, i+1)) {
                case "a":
                case "A":
                   aux = aux.concat("@");
                    break;
                    case "e":
                case "E":
                     aux = aux.concat("#");
                    
                    break;
                    case "i":
                case "I":
                     aux = aux.concat("$");
                    break;
                    case "o":
                case "O":
                     aux = aux.concat("%");
                    break;
                    case "u":
                case "U":
                     aux = aux.concat("*");
                    
                    break;
                 default:
                    aux = aux.concat(fra.substring(i, i + 1));
            }
        }
        System.out.println(aux);
    }
    
}
