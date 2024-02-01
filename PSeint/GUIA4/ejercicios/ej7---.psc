Funcion retorno <- Nentero ( num Por Referencia )
	Definir retorno Como Entero 
	
	Si Longitud(num) > 3 Entonces
		Escribir "el numero debe ser de tres digitos"
	Fin Si
	Si  Entonces
		retorno = ConvertirATexto(num)
	SiNo
		Escribir "entrada no valida"
	Fin Si
Fin Funcion

//
//7. Diseñar una función que reciba un numero en forma de cadena y lo devuelva como numero 
//entero. El programa podrá recibir números de hasta 3 dígitos. Nota: no poner números con
//decimales ni letras. Ejemplo: ingresando "100"(carácter) debe convertirse en 100(entero).

Algoritmo sin_titulo
	
	Definir num Como entero
	Definir numc Como Caracter	
	Escribir "ingrese un numero de tre digitos"
	Leer num
	
	numC = Nentero(num)
	
	
FinAlgoritmo
