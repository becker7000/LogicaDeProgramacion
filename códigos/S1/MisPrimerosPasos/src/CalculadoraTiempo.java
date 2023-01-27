import java.util.Scanner;

public class CalculadoraTiempo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int segundos,minutos;
		
		System.out.print("\n\t Escribe los segundos: ");
		segundos = entrada.nextInt();
		entrada.nextLine(); // Cerramos la línea
		
		System.out.println("\n\t "+segundos+" segundos son equivalentes a:");
		
		// Cálculamos los minutos:
		// 350 segundos = 5 minutos con 50 segundos
		minutos = segundos/60; // División entera
		segundos = segundos%60; // El resto 
		
		// %d es para enteros, %s es para cadenas
		System.out.printf("\n\t %d minutos con %d segundos.",minutos,segundos);
		
		entrada.close();
		
	}

}
