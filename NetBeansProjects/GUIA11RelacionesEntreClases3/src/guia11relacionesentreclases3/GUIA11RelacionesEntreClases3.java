/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11relacionesentreclases3;

import Entidades.Baraja;
import Servicios.BarajaServicio;
import java.util.Scanner;

/**
 *
 * @author fan1_
 */
public class GUIA11RelacionesEntreClases3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner leer = new Scanner(System.in);
        BarajaServicio bs = new BarajaServicio();
        Baraja baraja1 = bs.crearBaraja();
        boolean bucle = true;
        do {
            System.out.println("1- Barajar");
            System.out.println("2- Ver cartas disponible");
            System.out.println("3- Dar cartas");
            System.out.println("4- Cartas desechadas");
            System.out.println("5- Mostrar baraja");
            System.out.println("Cualquier número para salir");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    bs.barajar(baraja1);
                    break;
                case 2:
                    bs.cartasDisponibles(baraja1);
                    break;
                case 3:
                    bs.darCartas(baraja1);
                    break;
                case 4:
                    bs.cartasMonton(baraja1);
                    break;
                case 5:
                    bs.mostrarBaraja(baraja1);
                    break;
                default:
                    bucle = false;
            }
        } while (bucle);
    }
    
    
}
