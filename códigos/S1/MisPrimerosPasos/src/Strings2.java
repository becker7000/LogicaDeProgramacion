import java.util.Scanner;

public class Strings2 {

	public static void main(String[] args) {
		
		String password="java12345";
		Scanner entrada = new Scanner(System.in);
		
		String pass; // Constrase�a de entrada
		System.out.print("\n\t Escribe la constrase�a: ");
		pass = entrada.nextLine();
		
		System.out.println("\n\t Es correcta la constrase�a? R: "
				+ password.equals(pass));
		
		System.out.println("\n\t La constrase�a est� vac�a? R: "
				+ pass.isEmpty());
		
		entrada.close();
	}

}
