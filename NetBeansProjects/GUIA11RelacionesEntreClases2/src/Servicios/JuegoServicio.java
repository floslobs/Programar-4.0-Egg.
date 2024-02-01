/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author fan1_
 */
public class JuegoServicio {
       JugadorServicio js = new JugadorServicio();
    RevolverDeAguaServicio rs = new RevolverDeAguaServicio();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Juego llenarJuego() {
        ArrayList<Jugador> jugadores = new ArrayList();
        RevolverDeAgua revolver = rs.llenarRevolver();
        System.out.println("Cuántos jugadores van a participar?");
        int respuesta = leer.nextInt();
        if (respuesta > 6 || respuesta < 1) {
            respuesta = 6;
        }
        for (int i = 0; i < respuesta; i++) {
            Jugador jugador = new Jugador(i + 1);
            jugadores.add(jugador);
        }
        return new Juego(jugadores, revolver);
    }

    public void ronda(Juego juego) {
        while (true) {
            for (Jugador jugador : juego.getJugadores()) {
                js.disparo(jugador, juego.getRevolver());
                System.out.println(jugador.getNombre() + " " + jugador.getId() + " se dispara...");
                if (jugador.isMojado()) {
                    System.out.println(jugador.getNombre() + " " + jugador.getId() + " se mojó");
                    return;
                }
                System.out.println(jugador.getNombre() + " " + jugador.getId() + " sobrevive una ronda más");
            }
        }
    }
}

