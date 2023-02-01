
public class Dado {

	public static void main(String[] args) {
		
		// 0 y 0.99
		int dado =(int)(Math.random()*6+1); // min: 1.0 y max: 6.99
		
		// System.out.println("\n\t Dado: "+dado);
		
		switch(dado) { // Switch lambda 
		case 1 -> {
			System.out.print("\n\t UNO ");
			System.out.println("\n\t Fin ");
		}
		case 2 -> System.out.print("\n\t DOS ");
		case 3 -> System.out.print("\n\t TRES ");
		case 4 -> System.out.print("\n\t CUATRO ");
		case 5 -> System.out.print("\n\t CINCO ");
		case 6 -> System.out.print("\n\t SEIS ");
		}
		
	}
	
}
