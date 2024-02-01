package recordar;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fan1_
 */
public class parIMPAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("ingrese un numero");
        int num = sc.nextInt();
        
        if (num%2==0) {
            System.out.println("el numero es par");
            
        }else{
            System.out.println("el numero es impar");
        }
    }
    
}
