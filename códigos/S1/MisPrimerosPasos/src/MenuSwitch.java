import java.util.Scanner;

public class MenuSwitch {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("\n\t +--------------------+");
		System.out.print("\n\t | 1) Opción uno      |");
		System.out.print("\n\t | 2) Opción dos      |");
		System.out.print("\n\t | 3) Opción tres  	|");
		System.out.print("\n\t | 4) Opción cuatro	|");
		System.out.print("\n\t | 5) Salir    		|");
		System.out.print("\n\t +--------------------+");
		System.out.print("\n\t Opción> ");
		
		int opcion = entrada.nextInt(); entrada.nextLine();
		
		switch(opcion) { // Selector
		case 1: 
			System.out.println("\n\t Elegiste la opción 1");
			break;
		case 2:
			System.out.println("\n\t Elegiste la opción 2");
			break;
		case 3:
			System.out.println("\n\t Elegiste la opción 3");
			break;
		case 4:
			System.out.println("\n\t Elegiste la opción 4");
			break;
		case 5: 
			System.out.println("\n\t Saliendo del programa... ");
			break;
		default:
			System.out.println("\n\t Opción no contemplada...");
			break; // Opcional
		}

		
		entrada.close();
	}

}
