Proceso condicion_temp
	
	Definir temperatura Como Real;
	
	Imprimir " Escribe la temperatura: ";
	Leer temperatura;
	
	Si temperatura>35 y temperatura<40 Entonces
		Imprimir " La temperatura est� entre los 35 y 40 grados cent�grados.";
	SiNo 
		Si temperatura>50 y temperatura<55 Entonces
			Imprimir " La temperatura est� entre los 50 y 55 grados cent�grados.";
		SiNo
			Imprimir " La temperatura no est� dentro de ning�n rango v�lido";
		FinSi	
	FinSi
	
	
FinProceso
