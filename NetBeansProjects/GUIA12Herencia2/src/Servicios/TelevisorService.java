/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Electrodomestico;
import Entidades.Televisor;

/**
 *
 * @author fan1_
 */

   public class TelevisorService extends ElectrodomesticoService {

    public Televisor crearTelevisor() {
        Electrodomestico elec = crearElectrodomestico();
        System.out.println("Ingresa la resolución (en pulgadas) del televisor");
        int pulgadas = leer.nextInt();
        System.out.println("Tiene sintonizador? (S/N)");
        boolean sintonizador = false;
        if (leer.next().equalsIgnoreCase("S")) {
            sintonizador = true;
        }
        return new Televisor(elec.getPrecio(), elec.getColor(), elec.getConsumoEnergetico(), elec.getPeso(), pulgadas, sintonizador);
    }

    public double precioFinal(Televisor televisor) {
        super.precioFinal(televisor);
        if (televisor.getResolucion() > 40) {
            televisor.setPrecio(televisor.getPrecio() * 1.3);
        }
        if (televisor.isSintonizadorTDT()) {
            televisor.setPrecio(televisor.getPrecio() + 500);
        }

        return televisor.getPrecio();
    }
}