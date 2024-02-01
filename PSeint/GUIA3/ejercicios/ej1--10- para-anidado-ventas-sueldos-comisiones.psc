//Bucles Anidados
//1. Una compa��a de seguros tiene contratados a n vendedores. Cada vendedor realiza 
//m�ltiples ventas a la semana. La pol�tica de pagos de la compa��a es que cada vendedor 
//recibe un sueldo base m�s un 10% extra por comisiones de sus ventas. El gerente de la 
//compa��a desea saber, por un lado, cu�nto dinero deber� pagar en la semana a cada 
//vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cu�nto 
//deber� pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada 
//	vendedor ingresar cuanto es su sueldo base, cuantas ventas realiz� y cuanto cobr� por 
//cada venta.


Algoritmo sin_titulo
	Definir n, i, j Como Entero
	Definir sbase, comi, stotal Como Real
	Definir tcomisiones, tsueldos,monventa, vrealizadas Como Real
	
	tcomisiones <- 0
	tsueldos <- 0
	
	Escribir "Ingrese el n�mero de vendedores: "
	Leer n
	
	Para i <- 1 Hasta n Hacer
		Escribir "Vendedor ", i
		Escribir "Ingrese el sueldo base del vendedor: "
		Leer sbase
		
		comi <- 0
		stotal <- 0
		
		Escribir "Ingrese la cantidad de ventas realizadas por el vendedor: "
		Leer vrealizadas
		
		Para j <- 1 Hasta vrealizadas Hacer
			Escribir "Ingrese el monto cobrado por la venta ", j, ": "
			Leer monventa
			comi <- comi + 0.10 * monventa
		FinPara
		
		stotal <- sbase + comi
		Escribir "Comisiones del vendedor ", i, ": $", comi
		Escribir "Sueldo total del vendedor ", i, ": $", stotal
		
		tcomisiones <- tcomisiones + comi
		tsueldos <- tsueldos + stotal
		
	FinPara
	
	Escribir "Total de comisiones a pagar: $", tcomisiones
	Escribir "Total de sueldos a pagar: $", tsueldos

FinAlgoritmo
