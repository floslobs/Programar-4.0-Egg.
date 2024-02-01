/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6poo3;

import Entidad.Operacion;

/**
 *
 * @author fan1_
 */
public class GUIA6Poo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operacion operacion = new Operacion();
        
        operacion.crearOperacion();
        operacion.suma();
        operacion.resta();
        operacion.multiplicacion();
        operacion.dividir();
    }
    
}
