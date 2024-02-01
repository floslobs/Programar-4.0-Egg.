/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Baraja;
import Entidades.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author fan1_
 */
public class BarajaServicio {
      public Baraja crearBaraja() {
        Baraja baraja = new Baraja();
        String[] palos = {"Basto", "Copa", "Espada", "Oro"};
        ArrayList<Carta> mazo = new ArrayList();
        for (int j = 0; j < palos.length; j++) {
            for (int i = 1; i <= 12; i++) {
                if (i == 8 || i == 9) {
                    continue;
                }
                mazo.add(new Carta(i, palos[j]));
            }
        }
        baraja.setMazo(mazo);
        return baraja;
    }

    public void barajar(Baraja baraja) {
        System.out.println("Se barajó el mazo");
        Collections.shuffle(baraja.getMazo());
    }

    public void siguienteCarta(Baraja baraja) {
        ArrayList<Carta> monton = baraja.getMonton();
        if (baraja.getMazo().size() > 1) {
            System.out.println("Se entregó " + baraja.getMazo().get(0));
            monton.add(baraja.getMazo().remove(0));
        } else if (baraja.getMazo().size() == 1) {
            System.out.println("Se entregó " + baraja.getMazo().get(0));
            monton.add(baraja.getMazo().remove(0));
            System.out.println("No quedan más cartas");
        } 
    }

    public int cartasDisponibles(Baraja baraja) {
        System.out.println("Quedan " + baraja.getMazo().size() + " cartas disponibles");
        return baraja.getMazo().size();
    }

    public void darCartas(Baraja baraja) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el número de cartas que desea tomar");
        int cantidadCartas = leer.nextInt();
        if (cantidadCartas > baraja.getMazo().size()) {
            System.out.println("Solicitó más cartas de las que hay :|");
        } else {
            for (int i = 0; i < cantidadCartas; i++) {
                siguienteCarta(baraja);
            }
        }
    }

    public void cartasMonton(Baraja baraja) {
        if (baraja.getMonton().isEmpty()) {
            System.out.println("NO salió ninguna carta");
        } else {
            System.out.println(baraja.getMonton());
        }
    }

    public void mostrarBaraja(Baraja baraja) {
        System.out.println(baraja.getMazo());
    }

}
