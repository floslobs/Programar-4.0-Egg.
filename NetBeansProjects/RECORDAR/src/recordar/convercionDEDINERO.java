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
public class convercionDEDINERO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("ingrese cantidad de euros");
        double euros = sc.nextInt();
        System.out.println("a q moneda lo desea convertir?");
        System.out.println("A.Libras");
        System.out.println("B.Dolar");
        System.out.println("C.Yenes");
        String opcion = sc.next();
        pasaje(euros,opcion);
        
        
        
    }
    public static void pasaje(double euros, String opcion ) {
        double p;
        switch (opcion) {
            case "A":
                 p = euros * 0.86;
                 System.out.println("su dinero convertido en yanes  es; "+p);
                                
                break;
                case "B":
                 p = euros * 1.28;
                                  System.out.println("su dinero convertido en dolar  es; "+p);

                                
                break;
                case "C":
                 p = euros * 129.85;
                                  System.out.println("su dinero convertido en  yanes es; "+p);

                                
                break;
            default:
                System.out.println("la opcion no es correcta");
        }
    }
    
}
