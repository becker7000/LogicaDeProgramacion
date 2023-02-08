import javax.swing.JOptionPane;

public class SumaGauss {

	public static void main(String[] args) {
		
		int contador=1; // 1,2,3,4,5,6,...,100
		int suma=0; // 1,1+2,1+2+3,1+2+3+4,...
		
		int maximo=Integer.parseInt(JOptionPane.showInputDialog("Escribe el máximo: "));
		
		while(contador<=maximo) {
			suma+=contador; // suma=suma+contador
			contador++; 
		}
		
		System.out.println("\n\t La suma es: "+suma);
		
	}

}
