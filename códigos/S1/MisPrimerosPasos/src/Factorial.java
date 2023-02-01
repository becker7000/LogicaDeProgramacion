import javax.swing.JOptionPane;

public class Factorial {

	public static void main(String[] args) {
		
		// 4! = 4*3*2*1=24
		// 5! = 5*4*3*2*1=120
		int natural = Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero: "));
		long factorial=1; // Las variables que guardan multiplicaciones se inician en 1.
		// Existe una clase en Java que se llama BigInteger
		
		for(int i=natural;i>0;i--) {
			factorial*=i;
		}
		
		System.out.printf("\n\t %d! = %d",natural,factorial);
		
		// 1,2,3,4
		// 1,2,3,4,3,2,1,2,3,4
	}

}
