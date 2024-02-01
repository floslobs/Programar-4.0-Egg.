/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9clasedeutilidades3Array;

import Servicio.ArregloService;

/**
 *
 * @author fan1_
 */
public class GUIA9ClasedeUtilidades3 {

    /**
     * @param args the command line arguments
     */
    /*Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números
    reales.*/
    public static void main(String[] args) {
        // TODO code application logic here
         ArregloService arrS = new ArregloService();
        double[] A = new double[50];
        double[] B = new double[20];

        arrS.inicializarA(A);
        arrS.mostrarArreglo(A);
        arrS.mostrarArregloMayorAMenor(A);
        arrS.inicializarB(A, B);
        arrS.mostrarArreglo(A);
        arrS.mostrarArreglo(B);
    }
    
}
