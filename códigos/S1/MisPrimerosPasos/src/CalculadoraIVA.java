import java.util.Scanner;

public class CalculadoraIVA {

	public static void main(String[] args) {
		
		// Entradas:
		float monto_sin_iva, monto_con_iva;
		Scanner entrada = new Scanner(System.in);

		System.out.print("\n\t Escribe un monto sin IVA: $");
		monto_sin_iva = entrada.nextFloat();
		entrada.nextLine(); // Cerramos la línea
		
		//Cálculos:
		monto_con_iva = monto_sin_iva*1.16f;
		
		// Salidas:
		System.out.println("\n\t El monto con IVA es: $"+monto_con_iva);
		
		entrada.close();
	}

}
