import java.util.Scanner;

public class MenuSwitch {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("\n\t +--------------------+");
		System.out.print("\n\t | 1) Opci�n uno      |");
		System.out.print("\n\t | 2) Opci�n dos      |");
		System.out.print("\n\t | 3) Opci�n tres  	|");
		System.out.print("\n\t | 4) Opci�n cuatro	|");
		System.out.print("\n\t | 5) Salir    		|");
		System.out.print("\n\t +--------------------+");
		System.out.print("\n\t Opci�n> ");
		
		int opcion = entrada.nextInt(); entrada.nextLine();
		
		switch(opcion) { // Selector
		case 1: 
			System.out.println("\n\t Elegiste la opci�n 1");
			break;
		case 2:
			System.out.println("\n\t Elegiste la opci�n 2");
			break;
		case 3:
			System.out.println("\n\t Elegiste la opci�n 3");
			break;
		case 4:
			System.out.println("\n\t Elegiste la opci�n 4");
			break;
		case 5: 
			System.out.println("\n\t Saliendo del programa... ");
			break;
		default:
			System.out.println("\n\t Opci�n no contemplada...");
			break; // Opcional
		}

		
		entrada.close();
	}

}
