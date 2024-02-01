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
public class esMULTIPLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("ingrese dos numeros");
        int num1 =sc.nextInt();
        int num2 =sc.nextInt();
        multiplo(num1,num2);
        
        

    }
    public static void multiplo(int num1, int num2) {
        if (num1%num2==0) {
            System.out.println("es multiplo");
            
        }else{
            System.out.println("no es multiplo");
        }
    }
    
}
