/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10colecciones5;

import Servicios.PaisServicio;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author fan1_
 */
public class GUIA10Colecciones5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PaisServicio ps = new PaisServicio();
        HashSet<String> paises = ps.cargarPaises(leer);
        System.out.println("Ordenar y mostrar");
        System.out.println("------------------------");
        ps.ordernarYmostrar(paises);
        System.out.println("Eliminar pais");
        System.out.println("------------------------");
        ps.eliminarPais(paises, leer);
        System.out.println("Mostrar");
        System.out.println("------------------------");
        ps.ordernarYmostrar(paises);
    }
}
    
    

