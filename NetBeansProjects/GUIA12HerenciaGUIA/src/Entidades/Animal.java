/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Interfaces.IAnimalInterface;

/**
 *
 * @author fan1_
 */
public class Animal implements IAnimalInterface {

    public void hacerRuido() {
        System.out.println("Hola");
    }

    @Override
    public Animal crearAnimal() {
        return new Animal();
    }
}