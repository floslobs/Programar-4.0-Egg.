/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9clasedeutilidades6;

import Entidades.Curso;
import Servicio.CursoServicio;

/**
 *
 * @author fan1_
 */
public class GUIA9ClasedeUtilidades6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           CursoServicio cs = new CursoServicio();
        Curso curso = cs.crearCurso();

        cs.mostrarAlumnos(curso);
        cs.calcularGananciaSemanal(curso);
    }
    
}
