/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosPRACTICOSarregloYvectores;

/**
 *
 * @author fan1_
 */
public class ejej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
        cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
*/
        int cont =0;
        int[] vec = new int[100];
        for (int i = 0; i < 100; i++) {
            vec[i] = (int)(Math.random()*100);
            System.out.println(vec[i]);
                        
        }
         String nuy;//contabilizamos los digitos
        int unD = 0;
        int dosD = 0;
        int tresD = 0;
        int cuatroD = 0;
        int cincoD = 0;

        for (int i = 0; i < vec.length; i++) {
            nuy = String.valueOf(vec[i]);
            switch (nuy.length()) {
                case 1:
                    unD++;
                    break;
                case 2:
                    dosD += 1;
                    break;
                case 3:
                    tresD += 1;
                    break;
                case 4:
                    cuatroD += 1;
                    break;
                case 5:
                    cincoD += 1;
                    break;

            }

        }
        System.out.println("");
        System.out.println("Un Digito: " + unD);
        System.out.println("dos Digito: " + dosD);
        System.out.println("tres Digito: " + tresD);
        System.out.println("cuatro Digito: " + cuatroD);
        System.out.println("cinco Digito: " + cincoD);
    }
    
}
