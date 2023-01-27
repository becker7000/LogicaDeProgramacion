Proceso suma_gauss
	
	Definir N Como Entero;
	
	Imprimir " Escribe el valor de N: ";
	Leer N;
	
	Definir suma Como Entero;
	suma <- 0;
	
	Definir i Como Entero;
	Para i<- 1 Hasta N Con Paso 1 Hacer
		suma <- suma+i;
	FinPara
	
	Imprimir " La suma es: ",suma;
	
	
FinProceso
