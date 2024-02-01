//Realizar un algoritmo que permita cargar un vector con 25 números aleatorios 
//	positivos que representen las edades de un grupo de observación y calcule el 
//	promedio de edad, edad de la mayor persona, edad de la menor persona y si 
//		hay edad que se repitan.


Algoritmo sin_titulo
	definir vector, i, edadpromedio, edadmayor, edadmenor , totaledad Como Real
	Dimension vector[10]
	edadmayor=0
	edadmenor=0
	totaledad=1
	Para i = 0 Hasta 10-1 Con Paso 1 hacer
		Escribir "ingrese edad"
		leer vector[i]
	FinPara
	
	Para i = 2 Hasta 10-1 Hacer
        totaledad = totaledad + vector[i]
        Si vector[1] > vector[edadmayor] Entonces
            edadmayor = vector[i] 
        Fin Si
        Si vector[i] < vector[edadmenor] Entonces
            edadmenor = i
        Fin Si
    Fin Para
	
	edadpromedio= totaledad /10
	
	Escribir "edada mayor ", edadmayor 
	Escribir "edad menor ", edadmenor
	Escribir "promedio ", edadpromedio

FinAlgoritmo
