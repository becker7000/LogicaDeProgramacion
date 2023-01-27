Proceso condicion_temp
	
	Definir temperatura Como Real;
	
	Imprimir " Escribe la temperatura: ";
	Leer temperatura;
	
	Si temperatura>35 y temperatura<40 Entonces
		Imprimir " La temperatura está entre los 35 y 40 grados centígrados.";
	SiNo 
		Si temperatura>50 y temperatura<55 Entonces
			Imprimir " La temperatura está entre los 50 y 55 grados centígrados.";
		SiNo
			Imprimir " La temperatura no está dentro de ningún rango válido";
		FinSi	
	FinSi
	
	
FinProceso
