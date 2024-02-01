/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12herenciaguia;

import Entidades.Animal;
import Entidades.Gato;
import Entidades.Perro;
import java.util.ArrayList;

/**
 *
 * @author fan1_
 */
public class GUIA12HerenciaGUIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          
        ArrayList<Animal> animales = new ArrayList();

        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();
        animales.add(a);
        animales.add(b);
        animales.add(c);
        for (Animal animal : animales) {
            animal.hacerRuido();
        }
    }

    
    
}
