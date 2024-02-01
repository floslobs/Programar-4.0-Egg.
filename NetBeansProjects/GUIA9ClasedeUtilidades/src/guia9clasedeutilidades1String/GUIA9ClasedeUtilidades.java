/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9clasedeutilidades1String;

import Entidades.Cadena;
import Servicio.CadenaServicio;

/**
 *
 * @author fan1_
 */
public class GUIA9ClasedeUtilidades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cadena cad = new Cadena();
        CadenaServicio serv = new CadenaServicio();
        
        serv.mostrarVocales(cad);
        
    }
    
}
