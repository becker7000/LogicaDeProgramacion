import java.util.Scanner;

public class CalculadoraDesc {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		float monto_sin_desc, monto_con_desc;
		
		System.out.print("\n\t Escribe un monto: $");
		monto_sin_desc = entrada.nextFloat();
		entrada.nextLine();
		
		// 100 % -> 85%
		monto_con_desc = monto_sin_desc*0.85f;
		
		// Códigos de formato f%(float), %d(int), %c(char)
		System.out.printf("\n\t El monto con el 15%c de descuento es: $%.2f",37,monto_con_desc);
		
		entrada.close();
		
	}

}
