import javax.swing.JOptionPane;

public class RangosSwitch {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número: "));
		
		switch(numero) {
		case 1,2,3 -> System.out.println("\n\t El número está entre 1 y 3");
		case 4,5,6 -> System.out.println("\n\t El número está entre 4 y 6");
		case 8,7,9 -> System.out.println("\n\t El número está entre 7 y 9");
		default -> System.out.println("\n\t El número no está contemplado...");
		}
		
		
	}

}
