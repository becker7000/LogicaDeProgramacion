import java.util.Scanner;

public class Multiplo7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int entero;
		
		System.out.print("\n\t Escribe un n�mero entero: ");
		entero = entrada.nextInt();
		entrada.nextLine();
		
		if(entero%7==0) {
			System.out.println("\n\t El n�mero es m�ltiplo de 7");
		}else {
			System.out.println("\n\t El n�mero noooo es m�ltiplo de 7");
		}
		
		entrada.close();
		
	}

}
