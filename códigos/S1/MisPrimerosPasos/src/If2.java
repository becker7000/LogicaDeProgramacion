import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double numero;
		
		System.out.print("\n\t Escribe un n�mero real: ");
		numero = entrada.nextDouble();
		entrada.nextLine();
		
		if(numero>0) {
			System.out.print("\n\t El n�mero es positivo");
		}
		
		if(numero<0) {
			System.out.print("\n\t El n�mero es negativo");
		}
		
		if(numero==0) {
			System.out.print("\n\t El n�mero es exactamente cero");
		}
		
		entrada.close();
		
	}

}
