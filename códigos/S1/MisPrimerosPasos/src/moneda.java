
public class moneda {

	public static void main(String[] args) {

		// 0 o 1
		// Math.random() nos da un número double entre 0.0 y 0.999999
		// Math.random()*2 nos da un número double entre 0.0 y 1.8
		int moneda = (int)(Math.random()*2); // Transformando un double a int
		
		//System.out.print("\n\t Moneda: "+moneda);
		if(moneda==0) {
			System.out.println("\n\t Águila!");
		}else {
			System.out.println("\n\t Sol!");
		}
		
	}

}
