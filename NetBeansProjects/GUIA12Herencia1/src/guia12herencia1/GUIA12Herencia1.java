/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12herencia1;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Perro;
import Entidades.Gato;

/**
 *
 * @author fan1_
 */
public class GUIA12Herencia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //DECLARACION DEL OBJETO PERRO
        Animal perro1 = new Perro("Stich", "Carnivoro", 15, "Doberman");
        perro1.alimentarse();
        
        
        //DECLARACION DE OTRO OBJETO PERRO
        Animal perro2 = new Perro("teddy", "croqueta", 10, "chihuahua");
        perro2.alimentarse();
        
        //DECLARACION DEL OBJETO GATO
        Animal gato1 = new Gato("pelusa", "galletas", 15, "siames");
        gato1.alimentarse();
        
        //DECLARACION DEL OBJETO CABALLO
        Animal caballo1 = new Caballo("sparck", "pasto", 25, "fino");
        caballo1.alimentarse();
        
    }

    
    
}
