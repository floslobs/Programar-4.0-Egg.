/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author fan1_
 */
/*
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual.
Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la
cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque 
más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
*/
public class CuentaBancariaServicio {

    private Scanner sc = new Scanner(System.in);

    public CuentaBancaria crearCuenta() {
        System.out.println("Ingrese el número de cuenta:");
        int numeroCuenta = sc.nextInt();
        System.out.println("Ingrese el DNI del cliente:");
        long dniCliente = sc.nextLong();
        System.out.println("Ingrese el saldo inicial:");
        double saldoActual = sc.nextDouble();

        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
    }

    public void depositar(CuentaBancaria cuenta, double cantidad) {
        cuenta.setSaldoActual(cuenta.getSaldoActual() + cantidad);
    }

    public void retirar(CuentaBancaria cuenta, double cantidad) {
        double saldoActual = cuenta.getSaldoActual();
        double retiro = (saldoActual >= cantidad) ? cantidad : saldoActual;
        cuenta.setSaldoActual(saldoActual - retiro);
    }

    public void extraccionRapida(CuentaBancaria cuenta) {
        System.out.println("Se extrajo " + (cuenta.getSaldoActual() * 0.2));
        cuenta.setSaldoActual(cuenta.getSaldoActual() * 0.8);
    }

    public void consultarSaldo(CuentaBancaria cuenta) {
        System.out.println("Saldo actual: " + cuenta.getSaldoActual());
    }

    public void consultarDatos(CuentaBancaria cuenta) {
        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("DNI del cliente: " + cuenta.getDniCliente());
        System.out.println("Saldo actual: " + cuenta.getSaldoActual());
    }
}