//Diseña un programa que guarde una vocal secreta en una variable, debemos pedirle al usuario 
//que intente adivinar la vocal secreta, e intentará tantas veces como sea necesario hasta que la 
//adivine

Algoritmo sin_titulo
	
	Definir vocal, vocalS Como Caracter
	
	escribir "ingrese vocal"
	Leer vocal;
	
	vocalS = "U"
	Si vocal == vocalS Entonces
		Escribir "vocal secreta " vocal " --CORRECTA"
	SiNo
		Mientras vocal <> vocalS Hacer
			Escribir "ingrese vocal"
			leer vocal
		Fin Mientras
		Escribir "vocal secreta " vocal " --CORRECTA"
	Fin Si
	
	
FinAlgoritmo
