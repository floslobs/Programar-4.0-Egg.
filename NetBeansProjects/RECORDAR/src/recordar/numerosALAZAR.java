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
public class numerosALAZAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int[] vec = new int[10];
       
        for (int i = 0; i < 10; i++) {
            
           vec[i] = (int)(Math.random()*10);//lleno 10 numeros al azar
            System.out.println(vec[i]);
        }
       
       
        System.out.println("elija un numero");
            int num = sc.nextInt();
            
            for (int i = 0; i < 10; i++) {// analizamos si el numero esta y cuantas veces se repite
            if (num== vec[i]) {
                
                System.out.println("el numero se encuentra en la pocicion "+i);
                }else{
                System.out.println("el numero no se encontro");
            }
            
            }   
    }
    
}
