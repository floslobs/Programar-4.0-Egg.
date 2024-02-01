/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9clasedeutilidades4Date;

import Servicio.fechaServicio;
import java.util.Date;

/**
 *
 * @author fan1_
 */
public class GUIA9ClaesedeUtilidades4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            fechaServicio fechaService = new fechaServicio();

        // Obtener la fecha de nacimiento del usuario
        Date fechaNacimiento = fechaService.fechaNacimiento();

        // Obtener la fecha actual
        Date fechaActual = fechaService.fechaActual();

        // Calcular la diferencia de años (edad del usuario)
        int edad = fechaService.diferencia(fechaNacimiento, fechaActual);

        System.out.println("Tu edad es: " + edad + " años");
    
    }
    
}
