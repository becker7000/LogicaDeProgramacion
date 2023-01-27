import java.util.Scanner;

public class Strings2 {

	public static void main(String[] args) {
		
		String password="java12345";
		Scanner entrada = new Scanner(System.in);
		
		String pass; // Constraseña de entrada
		System.out.print("\n\t Escribe la constraseña: ");
		pass = entrada.nextLine();
		
		System.out.println("\n\t Es correcta la constraseña? R: "
				+ password.equals(pass));
		
		System.out.println("\n\t La constraseña está vacía? R: "
				+ pass.isEmpty());
		
		entrada.close();
	}

}
