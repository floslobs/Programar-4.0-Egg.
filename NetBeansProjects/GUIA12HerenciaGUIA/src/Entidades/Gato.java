/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author fan1_
 */
public class Gato extends Animal {

    @Override
    public void hacerRuido() {
        System.out.println("Miau");
    }

    @Override
    public Animal crearAnimal() {
        return new Gato();
    }
}