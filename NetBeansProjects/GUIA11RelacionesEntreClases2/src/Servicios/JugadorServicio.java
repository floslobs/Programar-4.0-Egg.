/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Jugador;
import Entidades.RevolverDeAgua;

/**
 *
 * @author fan1_
 */
public class JugadorServicio {
    
    RevolverDeAguaServicio rs = new RevolverDeAguaServicio();

    public boolean disparo(Jugador jugador, RevolverDeAgua r) {
        boolean mojar = rs.mojar(r);
        if (mojar) {
            jugador.setMojado(true);
        }
        rs.siguienteChorro(r);
        return mojar;
    }
}

