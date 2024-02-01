/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;
//Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
import static java.lang.Math.PI;
import servicios.calculosFormas;

//Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
public class Circulo implements calculosFormas {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return PI * Math.pow(this.radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return PI * radio * 2;
    }

}

