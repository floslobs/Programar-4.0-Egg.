Algoritmo ezee
	
    definir ventas, i, dmaximo, dminimo, tventas, pventas Como Real
	
	Dimension ventas[7]
	dmaximo=0
	dminimo=0
	tventas=0

	
	para i=0 Hasta 6 Con Paso 1 Hacer
		Escribir "ingrese venta del dia"
		leer ventas[i]
		
		
	FinPara
	
   
	
    Para i <- 2 Hasta 7 Hacer
        tventas <- tventas + ventas[1]
        Si ventas[i-1] > ventas[dmaximo] Entonces
            dmaximo <- i
        Fin Si
        Si ventas[i-1] < ventas[dminimo] Entonces
            dminimo <- i
        Fin Si
    Fin Para
	
    pventas <- tventas / 7
	
    Escribir "El día que más se vendió fue el día ", dmaximo +1
    Escribir "El día que menos se vendió fue el día ", dminimo
    Escribir "El promedio de ventas de la semana es ", pventas

	para i=0 Hasta 6 Con Paso 1 Hacer
		escribir Sin Saltar ventas[i]
	FinPara
	
	
FinAlgoritmo
