/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11relacionesentreclases2;

import Entidades.Juego;
import Servicios.JuegoServicio;

/**
 *
 * @author fan1_
 */
public class GUIA11RelacionesEntreClases2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           while (true) {
            JuegoServicio js = new JuegoServicio();
            Juego juego = js.llenarJuego();
            js.ronda(juego);
        }
    }
}
