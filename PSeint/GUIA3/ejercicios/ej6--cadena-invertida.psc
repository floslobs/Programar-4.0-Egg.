//Siguiendo el ejercicio 20 de los ejercicios principales, ahora deberemos hacer lo mismo 
//pero que la cadena se muestre al revés. Por ejemplo, si tenemos la cadena: Hola, 
//		deberemos mostrar a l o H

Algoritmo sin_titulo
	
	Definir fra, fraI Como Caracter
	Definir i, long Como Entero
	fra = " "
	fraI = ""
	i = 0
	Escribir "ingrese una cadena "
	Leer fra
	
	long = Longitud(fra) 
	
	Escribir "la cadena al reves es: "
	Para i <- long -1   Hasta 0 Con Paso -1 Hacer
		fraI = fraI + SubCadena(fra, i  , i)
	Fin Para
	Escribir fraI
FinAlgoritmo
