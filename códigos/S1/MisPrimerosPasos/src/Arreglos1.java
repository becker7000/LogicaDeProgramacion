import java.util.Scanner;

public class Arreglos1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int[] edades = new int[5]; // Arreglo unidimensional.
		
		for(int i=0;i<edades.length;i++) {
			System.out.printf("\n\t Edad[%d]: ",i);
			edades[i]=entrada.nextInt();
			entrada.nextLine();
		}
		
		System.out.print("\n\n\t Edades guardadas: ");
		for(int i=0;i<edades.length;i++) {
			System.out.print(" "+edades[i]);
		}
		
		int edad_menor=edades[0],edad_mayor=edades[0];
		for(int i=0;i<edades.length;i++) {
			if(edad_menor>edades[i]) {
				edad_menor=edades[i];
			}
			if(edad_mayor<edades[i]) {
				edad_mayor=edades[i];
			}
		}
		
		System.out.printf("\n\t La edad menor es: %d",edad_menor);
		System.out.printf("\n\t La edad mayor es: %d",edad_mayor);
		
		entrada.close();
		
	}

}
