/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.pardeNumeros;

/**
 *
 * @author fan1_
 */
/*Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá además implementar 
los siguientes métodos:
Método mostrarValores que muestra cuáles son los dos números guardados.
Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número.
Previamente se deben redondear ambos valores.
Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la
raíz cuadrada se debe obtener el valor absoluto del número.
*/
public class pardeNumerosService {
    
    public void mostrarValores(pardeNumeros par) {
        System.out.println(" numero 1 : "+par.getNum1());
        System.out.println(" numero 2 : "+par.getNum2());
    }
    
    public double devolverMayor(pardeNumeros par) {
        return Math.max(par.getNum1(), par.getNum2());
        
        
    }
    
    public double calcularPotencia(pardeNumeros par) {
        double mayor = devolverMayor(par);
        double menor = (mayor == par.getNum1()) ? par.getNum2() : par.getNum1();
        return Math.pow(Math.round(mayor), Math.round(menor));
    }
       public double calcularRaiz(pardeNumeros par) {
        double menor = Math.min(par.getNum1(), par.getNum2());
        return Math.sqrt(Math.abs(menor));
    }
    
    
}