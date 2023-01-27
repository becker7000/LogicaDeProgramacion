import java.util.Scanner;

public class Ternario {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int edad;
		
		System.out.print("\n\t Escribe tu edad: ");
		edad = entrada.nextInt();
		entrada.nextLine();
		
		// %s código de formato para cadenas.
		System.out.printf("\n\t %s",((edad>=18)? 
				"Eres mayor de edad":"Eres menor de edad"));
		
		entrada.close();
		
	}

}
