/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10colecciones1Y2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author fan1_
 */
public class GUIA10Colecciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.*/
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> razas = new ArrayList();
        String resp, perro;
        do {
            System.out.println("ingrese la raza de perro");
            razas.add(sc.next().toUpperCase());
            System.out.println("decea agregar S/N?");
            resp = sc.next();

        } while (!resp.equals("N"));
         System.out.println("LISTA-----------");
        if (resp != "N") {
            for (String raza : razas) {
                
                System.out.println(raza);
            }
        }
 /*Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.*/
 
        System.out.println("Ingrese el nombre de la raza que desea eliminar");
        String razaEliminar = sc.next().toUpperCase();
        boolean noEncontrado = true;
        Iterator it = razas.iterator();
        System.out.println("---------------------------------");
        while (it.hasNext()) {
            if (it.next().equals(razaEliminar)) {
                it.remove();
                noEncontrado = false;
                break;
            }
        }
        Collections.sort(razas);
        for (String razaPerro : razas) {
            System.out.println(razaPerro);
        }
        if (noEncontrado) {
            System.out.println("NO se encontró la raza que desea eliminar");
        }

    }
    
}