import javax.swing.JOptionPane;

public class TrianguloWhile {

	public static void main(String[] args) {
		
		int pisos=Integer.parseInt(JOptionPane.showInputDialog("�Cuantos pisos?"));
		char simbolo=JOptionPane.showInputDialog("Escribe un caracter: ").charAt(0);
		
		int i=1, j;
		
		// Arte ASCII:
		while(i<=pisos) {
			System.out.println("\n");
			j=0;
			while(j<i) {
				System.out.print("\t "+simbolo);
				j++;
			}
			i++;
		}
		
		/*
		 * Nota: Usamos while cuando no sabemos el n�mero 
		 * 		 exacto de veces que queremos iterar un bloque 
		 * 		 de c�digo, pero s� sabemos la condici�n bajo 
		 * 		 la c�al dejara de iterarse.
		 * */
		
		
	}
	
}
