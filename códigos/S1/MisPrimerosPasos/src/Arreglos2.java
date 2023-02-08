import java.util.Scanner;

public class Arreglos2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[] edades = new int[5];
		double promedio=0; // Las sumas se inician en cero
		
		for(int i=0;i<edades.length;i++) {
			System.out.printf("\n\t Edad[%d]: ",i+1);
			edades[i]=entrada.nextInt();
			entrada.nextLine();
			promedio+=edades[i];
		}
		
		promedio/=edades.length;
		System.out.print("\n\t El promedio de las edades es: "+promedio);
		
		
		entrada.close();
	}

}
