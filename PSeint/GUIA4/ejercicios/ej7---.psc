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
//7. Dise�ar una funci�n que reciba un numero en forma de cadena y lo devuelva como numero 
//entero. El programa podr� recibir n�meros de hasta 3 d�gitos. Nota: no poner n�meros con
//decimales ni letras. Ejemplo: ingresando "100"(car�cter) debe convertirse en 100(entero).

Algoritmo sin_titulo
	
	Definir num Como entero
	Definir numc Como Caracter	
	Escribir "ingrese un numero de tre digitos"
	Leer num
	
	numC = Nentero(num)
	
	
FinAlgoritmo
