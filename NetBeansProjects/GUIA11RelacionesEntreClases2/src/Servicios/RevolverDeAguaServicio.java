/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.RevolverDeAgua;

/**
 *
 * @author fan1_
 */
public class RevolverDeAguaServicio {
    
    public RevolverDeAgua llenarRevolver() {
        return new RevolverDeAgua();
    }

    public boolean mojar(RevolverDeAgua revolver) {
        return revolver.getPosicionActual() == revolver.getPosicionAgua();
    }

    public void siguienteChorro(RevolverDeAgua revolver) {
        if (revolver.getPosicionActual() == 6) {
            revolver.setPosicionActual(1);
        } else {
            revolver.setPosicionActual(revolver.getPosicionActual() + 1);
        }
    }

}
