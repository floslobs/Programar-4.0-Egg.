//Un docente de Programación tiene un listado de 3 notas registradas por cada uno de sus 
//N estudiantes. La nota final se compone de un trabajo práctico Integrador (35%), una 
//Exposición (25%) y un Parcial (40%). El docente requiere los siguientes informes claves de 
//sus estudiantes:
//	§ Nota promedio final de los estudiantes que reprobaron el curso. Un estudiante 
//	reprueba el curso si tiene una nota final inferior a 6.5
//	§ Porcentaje de alumnos que tienen una nota de integrador mayor a 7.5.
//	§ La mayor nota obtenida en las exposiciones.
//	§ Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5.
//	El programa pedirá la cantidad de alumnos que tiene el docente y en cada alumno pedirá 
//	las 3 notas y calculará todos informes claves que requiere el docente. 


Algoritmo sin_titulo
	
	definir alum Como Caracter
	Definir prac, expo, parcial, prom, promF, porcM, cant, i, expM, alumaprob, alumImay, alumPar como real
	Escribir "ingrese la cantidad de alumnos"
	leer cant
	prom = 0
	expM = 0
	alumImay = 0
	alumaprob = 0
	alumPar = 0
	porcM = 0
	Para i<-1 Hasta cant Con Paso 1 Hacer
		Escribir "nombre del alumno"
		leer alum
		Escribir "ingrese la nota del practico integrador, del la expocion y del parcial"
		leer prac, expo, parcial
		
		promF = (prac * 0.35) + (expo * 0.25) + (parcial * 0.40)
		
		prom = prom + promF
		
		Si promF < 6.5 Entonces
            alumaprob <- alumaprob + 1
        FinSi
		
        // Verificar si la nota de integrador es mayor a 7.5
        Si prac > 7.5 Entonces
            alumImay <- alumImay + 1
        FinSi
		
		// Actualizar la mayor nota de exposición
        Si expo > expM Entonces
            expM <- expo
        FinSi
		
        // Verificar si la nota de parcial está entre 4.0 y 7.5
        Si parcial >= 4.0 Y parcial <= 7.5 Entonces
            alumPar <- alumPar + 1
        FinSi
    FinPara
	
    // Calcular el porcentaje de alumnos con nota de integrador mayor a 7.5
    porcM <- (alumImay * 100) / cant
	
    Escribir "Informe Claves:"
    Escribir "1. Nota promedio final de los estudiantes que reprobaron el curso: ", alumaprob " " alum
    Escribir "2. Porcentaje de alumnos con nota de integrador mayor a 7.5: ", alumImay, "%"
    Escribir "3. La mayor nota obtenida en las exposiciones: ", expM
    Escribir "4. Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5: ", alumPar


	
FinAlgoritmo
