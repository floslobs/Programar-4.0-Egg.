/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12herencia4;

import Entidad.Circulo;
import Entidad.Rectangulo;

/**
 *
 * @author fan1_
 */
public class GUIA12Herencia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          
        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(4, 7);

        System.out.println("El área del círculo es: " + circulo.calcularArea());
        System.out.println("El perímetro del círculo es: " + circulo.calcularPerimetro());

        System.out.println("El área del cuadrado es: " + rectangulo.calcularArea());
        System.out.println("El perímetro del cuadrado es: " + rectangulo.calcularPerimetro());

    }
}

