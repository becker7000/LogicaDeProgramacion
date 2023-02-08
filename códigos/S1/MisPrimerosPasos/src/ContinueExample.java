
public class ContinueExample {

	public static void main(String[] args) {
		
		int folio=0;
		
		while(folio<12) {
			folio++;
			if(folio==3 || folio==5) {
				continue;
			}
			System.out.print("\n\t Folio: "+folio);
		}
		
		
	}

}
