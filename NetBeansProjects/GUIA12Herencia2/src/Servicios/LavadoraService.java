/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Electrodomestico;
import Entidades.Lavadora;

/**
 *
 * @author fan1_
 */
public class LavadoraService extends ElectrodomesticoService {

    public Lavadora crearLavadora() {
        Electrodomestico elec = crearElectrodomestico();
        System.out.println("Ingrese la carga de la lavadora");
        int carga = leer.nextInt();
        return new Lavadora(elec.getPrecio(), elec.getColor(), elec.getConsumoEnergetico(), elec.getPeso(), carga);
    }

    public double precioFinal(Lavadora lavadora) {
        super.precioFinal(lavadora);
        if (lavadora.getCarga() > 30) {
            lavadora.setPrecio(lavadora.getPrecio() + 500);
        }
        return lavadora.getPrecio();
    }
}