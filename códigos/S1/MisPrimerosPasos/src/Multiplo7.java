import java.util.Scanner;

public class Multiplo7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int entero;
		
		System.out.print("\n\t Escribe un número entero: ");
		entero = entrada.nextInt();
		entrada.nextLine();
		
		if(entero%7==0) {
			System.out.println("\n\t El número es múltiplo de 7");
		}else {
			System.out.println("\n\t El número noooo es múltiplo de 7");
		}
		
		entrada.close();
		
	}

}
