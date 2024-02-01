/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11relacionesentreclasesguia2;

import Entidades.Equipo;
import Entidades.Jugador;
import java.util.Scanner;

/**
 *
 * @author fan1_
 */
public class GUIA11RelacionesEntreClasesguia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean cargar = true;
        Equipo equipo1 = new Equipo();

        do {
            Jugador jugador = new Jugador();
            System.out.println("Ingrese el nombre del jugador");
            jugador.setNombre(leer.next());
            System.out.println("Ingrese el apellido del jugador");
            jugador.setApellido(leer.next());
            System.out.println("Ingrese la posicion del jugador");
            jugador.setPosicion(leer.nextInt());
            System.out.println("Ingrese el numero del jugador");
            jugador.setNumero(leer.nextInt());
            System.out.println("Desea ingresar otro? S/N");
            if (leer.next().equalsIgnoreCase("N")) {
                cargar = false;
            }
            equipo1.getEquipo().add(jugador);
        } while (cargar);
        for (Jugador jugador : equipo1.getEquipo()) {
            System.out.println(jugador.toString());
        }
    }
}