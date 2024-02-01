/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author fan1_
 */
public class ProductoServicio {
    
    public void introducirProducto(HashMap<String, Double> productos, Scanner leer) {
        boolean bucle = true;
        do {
            System.out.println("Ingrese el nombre del producto");
            String nombre = leer.next();
            System.out.println("Ingrese el precio del producto");
            double precio = leer.nextDouble();
            productos.put(nombre, precio);
            System.out.println("Desea agregar otro elemento?");
            if (leer.next().equalsIgnoreCase("N")) {
                bucle = false;
            }
        } while (bucle);
    }

    public void modificarPrecio(HashMap<String, Double> productos, Scanner leer) {
        System.out.println("Ingrese el producto que desea modificar");
        String producto = leer.next();
        System.out.println("Ingrese el precio que desea modificar");
        double precioActual = leer.nextDouble();
//key
        productos.replace(producto, precioActual);
    }

    public void eliminarProducto(HashMap<String, Double> productos, Scanner leer) {
        System.out.println("Ingrese el producto que desea elimimar");
        String producto = leer.next();
        productos.remove(producto);
    }

    public void mostrarProductos(HashMap<String, Double> productos) {
        for (Map.Entry<String, Double> producto : productos.entrySet()) {
            System.out.println("Producto: " + producto.getKey() + " precio: " + producto.getValue());
        }
    }
}

