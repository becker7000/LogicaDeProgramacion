import java.util.Scanner;

public class FiltroDoWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
		do { // Filtro
			System.out.print("\n\t Escribe un n�mero entre 1 y 5: ");
			numero = entrada.nextInt(); 
			entrada.nextLine();
		}while(numero<1 || numero>5);
		
		System.out.println("\n\t N�mero dentro del rango.");
		
		entrada.close();
		
	}

}
