import javax.swing.JOptionPane;

public class Rangos1 {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un n�mero entre 2 y 5: "));
		
		if(numero>=2 && numero<=5) {
			System.out.println("\n\t El n�mero est� en el rango...");
		}else {
			System.out.println("\n\t El n�mero est� fuera de rango...");
		}
		
	}

}
