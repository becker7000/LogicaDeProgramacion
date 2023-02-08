import java.util.Scanner;

public class Arreglos3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		final int N; // Las constantes van en mayúsculas
		System.out.print("\n\t Dame el tamaño de la lista: ");
		N=Integer.parseInt(entrada.nextLine());
		
		int lista[] = new int[N]; // N es el tamaño dado por el usuario.
		
		for(int i=0;i<lista.length;i++) {
			System.out.print("\n\t Valor de elemento #"+(i+1)+": ");
			lista[i]=Integer.parseInt(entrada.nextLine());
		}
		
		// Imprimiendo el arreglo sin ordenar:
		System.out.print("\n\t Lista de datos sin ordenar: ");
		for( int aux : lista) {
			System.out.print(" "+aux);
		}
		
		int opcion=0;
		
		while(opcion!=4) {
		
		// Creando un menú para tratar la lista:
		do {
			System.out.print("\n\t +-----------------------+");
			System.out.print("\n\t | 1. Ordenar la lista   |");
			System.out.print("\n\t | 2. Buscar elemento    |");
			System.out.print("\n\t | 3. Rango de la lista  |");
			// TODO: agregar la opciones: calcular promedio, calcular mediana, calcular la moda
			System.out.print("\n\t | 4. Salir              |");
			System.out.print("\n\t +-----------------------+");
			System.out.print("\n\t Opción: ");
			opcion=Integer.parseInt(entrada.nextLine());
		}while(opcion<1 || opcion>4);
		
		switch(opcion) {
		case 1 -> {
			// Inicia el algorítmo de ordenamiento por el método de la burbuja:
			int actual;
			int siguiente;
			
			for(int i=0;i<lista.length;i++) { // 5
				
				for(int j=0;j<lista.length-1;j++) {
					actual=lista[j]; // Se asigna el elemento en el que va la comparación
					siguiente=lista[j+1];
					
					// Validación para saber si los elementos están en desorden:
					// Para ordenar en modo descendente usar '<'
					if(actual>siguiente) { // 45>30
						// Intercambiamos los valores de posición 
						lista[j]=siguiente;
						lista[j+1]=actual;
					}
				}
			} // Fin del algorítmo de ordenamiento (Pasarlo a PSEInt)
			
			// Imprimiendo el arreglo ordenado:
			System.out.print("\n\t Lista de datos ordenada (ASC): ");
			for( int aux : lista) {
				System.out.print(" "+aux);
			}
		}
		case 2 -> {
			// Inicia algorítmo de busqueda secuencial:
			
			int elemento;
			boolean banderilla=false; // Es falso que hemos encontrado el elemento
			
			System.out.print("\n\t Escribe un elemento a buscar: ");
			elemento=Integer.parseInt(entrada.nextLine());
			
			// Recorriendo el arreglo con un foreach
			for( int aux : lista) {
				if(elemento==aux) {
					banderilla=true;
					System.out.printf("\n\t El elemento %d SÍ está en la lista.",elemento);
					break; // Rompe el bucle for un vez encontrado el dato. 
				}
			}
			
			// Bloque en caso deque el elemento a buscar no haya sido encontrado:
			if(!banderilla) { // banderilla==false es lo mismo que !banderilla (!false)
				System.out.printf("\n\t El elemento %d NO está en la lista.",elemento);
			} // Termina algorítmo de busqueda secuencial
		}
		case 3 ->{
			int menor=lista[0],mayor=lista[0];
			for(int aux : lista) {
				if(menor>aux) {
					menor=aux;
				}
				if(mayor<aux) {
					mayor=aux;
				}
			}
			System.out.printf("\n\t El rango de la lista es de %d a %d.",menor,mayor);
		}
		case 4 ->{
			System.out.print("\n\t Fin del programa, fin del curso...");
		}
		
		}
		
		}
		
		
		entrada.close();
		
	}

}

/*
 * 	Algorítmo de ordenamiento por el método de la Burbuja:
 * 	(Otros algorítmos: seleccción, inserción, rápido, mezcla)
 * 
 * 	edades[] = { 6, 3, 8, 2, 4 } pos=5, comp=4  (Ordenados: 2,3,4,6,8)
 * 
 * 	6, 3, 8, 2, 4
 * 
 * 	PASADA #0: comp=4
 * 	3, 6, 8, 2, 4
 * 	3, 6, 8, 2, 4
 * 	3, 6, 2, 8, 4
 *  3, 6, 2, 4, 8
 *  
 *  PASADA #1: comp=3
 *  3, 6, 2, 4, 8
 *  3, 2, 6, 4, 8
 *  3, 2, 4, 6, 8
 * 
 * 	PASADA #2: comp=2 (El algorítmo termina de ordenar cuando las 
 * 	pasadas y las comparacones son iguales)
 * 	2, 3, 4, 6, 8
 * 	2, 3, 4, 6, 8
 * 
 * */
