Algoritmo sin_titulo
	
	Definir ventas, i como Entero;
	Dimension ventas[7];
    Definir diaMaximo, dia, diaMinimo como Entero;
    Definir totalVentas, promedioVentas como Real;
	
    Para i <- 1 Hasta 7 Hacer
        Escribir "Ingrese las ventas del d�a "
        Leer dia;
    Fin Para
	
    diaMaximo <- 1
    diaMinimo <- 1
    totalVentas <- ventas[i]
	
    Para i <- 2 Hasta 7 Hacer
        totalVentas <- totalVentas + ventas[1]
        Si ventas[i] > ventas[diaMaximo] Entonces
            diaMaximo <- i
        Fin Si
        Si ventas[i] < ventas[diaMinimo] Entonces
            diaMinimo <- i
        Fin Si
    Fin Para
	
    promedioVentas <- totalVentas / 7
	
    Escribir "El d�a que m�s se vendi� fue el d�a ", diaMaximo
    Escribir "El d�a que menos se vendi� fue el d�a ", diaMinimo
    Escribir "El promedio de ventas de la semana es ", promedioVentas
FinAlgoritmo