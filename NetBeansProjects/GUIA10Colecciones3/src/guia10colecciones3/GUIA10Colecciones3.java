/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10colecciones3;

import Entidades.Alumno;
import Servicios.AlumnoServicio;
import java.util.ArrayList;

/**
 *
 * @author fan1_
 */
public class GUIA10Colecciones3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          AlumnoServicio as = new AlumnoServicio();
        ArrayList<Alumno> alumnos = as.crearListaAlumnos();

        for (Alumno alumno : alumnos) {
            System.out.println(alumno.toString());
        }

        System.out.println("El promedio del alumno es " + as.buscarAlumno(alumnos));
    }
}

