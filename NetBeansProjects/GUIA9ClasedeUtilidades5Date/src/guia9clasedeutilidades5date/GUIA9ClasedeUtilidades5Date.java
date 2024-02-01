/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9clasedeutilidades5date;

import Entidades.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author fan1_
 */
public class GUIA9ClasedeUtilidades5Date {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          PersonaServicio personaService = new PersonaServicio();

        Persona persona = personaService.crearPersona();

        int edad = personaService.calcularEdad(persona);
        System.out.println("La edad de " + persona.getNombre() + " es: " + edad + " años");

        int edadComparar = 30;
        boolean esMenor = personaService.menorQue(persona, edadComparar);
        System.out.println(persona.getNombre() + (esMenor ? " es" : " no es") + " menor que " + edadComparar + " años");

        System.out.println("Información de la persona:");
        personaService.mostrarPersona(persona);
    }

    
    
}
