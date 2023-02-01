import javax.swing.JOptionPane;

public class MatrizAleatoria {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe el valor de n: "));
		
		for(int i=0;i<numero;i++) {
			System.out.println("\n"); // Salto de línea
			for(int j=0;j<numero;j++) {
				System.out.printf(" \t %d",(int)(Math.random()*41+10)); // 10 y 50
			}
		}
		
	}

}
