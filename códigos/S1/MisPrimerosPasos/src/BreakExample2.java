import javax.swing.JOptionPane;

public class BreakExample2 {

	public static void main(String[] args) {
		
		float aleatorio;
		char centinela='a';
		
		while(centinela!='x') {
			centinela=JOptionPane.showInputDialog("Escribe un caracter: ").charAt(0);
			aleatorio=(float)(Math.random()*20);
			System.out.printf("\n\t Aleatorio: %.3f y caracter: %c",aleatorio,centinela);
		}
		
		System.out.println("\n\t Fin del bucle.");
		
	}

}
