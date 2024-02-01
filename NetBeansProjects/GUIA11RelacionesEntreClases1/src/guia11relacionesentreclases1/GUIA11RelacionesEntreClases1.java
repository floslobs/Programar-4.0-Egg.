/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11relacionesentreclases1;

import Entidades.Perro;
import Entidades.Persona;

/**
 *
 * @author fan1_
 */
public class GUIA11RelacionesEntreClases1 {

    /**
     * @param args the command line arguments
     * Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        Persona[] personas = new Persona[2];
        
        personas[0] = new Persona("florencia", "lobosco", 32, 362727768, null);
        personas[1] = new Persona("valen", "palacios", 9, 53445678, null);
        
        Perro[] perros = new Perro[2];
         perros[0] = new Perro("flo", "colly", 3,"fa");
        perros[1] = new Perro("valen", "pal", 9, "gre");
        
        
        for (int i = 0; i < personas.length; i++) {
            personas[i].setPerro(perros[i]);
        }

        for (Persona persona : personas) {
            System.out.println(persona);
        }    
            
    }
    
}
