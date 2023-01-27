import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double numero;
		
		System.out.print("\n\t Escribe un número real: ");
		numero = entrada.nextDouble();
		entrada.nextLine();
		
		if(numero>0) {
			System.out.print("\n\t El número es positivo");
		}
		
		if(numero<0) {
			System.out.print("\n\t El número es negativo");
		}
		
		if(numero==0) {
			System.out.print("\n\t El número es exactamente cero");
		}
		
		entrada.close();
		
	}

}
