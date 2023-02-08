import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> nombres = new ArrayList<>();
		
		// Agregando varios nombres:
		nombres.add("Laura");
		nombres.add("Pepe");
		nombres.add("Paco");
		nombres.add("Luc�a");
		
		// Eliminando un nombre sin saber su �ndice:
		nombres.remove(nombres.indexOf("Paco"));
		
		nombres.add("Ana");
		nombres.add("Eder");
		nombres.add("Mar�a");
		
		for(String nombre : nombres) {
			System.out.print("\n\t Nombre: "+nombre+", Index: "+nombres.indexOf(nombre));
		}
		
	}

}

// CRUD: create, read, update, delete


