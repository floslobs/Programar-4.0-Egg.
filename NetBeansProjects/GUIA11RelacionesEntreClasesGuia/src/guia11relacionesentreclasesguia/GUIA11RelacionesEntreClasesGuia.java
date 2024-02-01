/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11relacionesentreclasesguia;

import Entidades.Dni;
import Entidades.Persona;

/**
 *
 * @author fan1_
 */
public class GUIA11RelacionesEntreClasesGuia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Persona persona1 = new Persona();
        Dni dni1 = new Dni();
        dni1.setSerie('B');
        dni1.setNumero(123451);
        persona1.setNombre("Jeremias");
        persona1.setApellido("Rivelli");
        persona1.setDni(dni1);
        System.out.println("El DNI de la " + persona1.getNombre() + " " + persona1.getApellido() + " persona es " + persona1.getDni().getNumero() + persona1.getDni().getSerie());
    }
}
 