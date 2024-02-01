//Bucles Anidados
//1. Una compañía de seguros tiene contratados a n vendedores. Cada vendedor realiza 
//múltiples ventas a la semana. La política de pagos de la compañía es que cada vendedor 
//recibe un sueldo base más un 10% extra por comisiones de sus ventas. El gerente de la 
//compañía desea saber, por un lado, cuánto dinero deberá pagar en la semana a cada 
//vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cuánto 
//deberá pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada 
//	vendedor ingresar cuanto es su sueldo base, cuantas ventas realizó y cuanto cobró por 
//cada venta.


Algoritmo sin_titulo
	Definir n, i, j Como Entero
	Definir sbase, comi, stotal Como Real
	Definir tcomisiones, tsueldos,monventa, vrealizadas Como Real
	
	tcomisiones <- 0
	tsueldos <- 0
	
	Escribir "Ingrese el número de vendedores: "
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
