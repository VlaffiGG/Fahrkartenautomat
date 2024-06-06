//A7.4.2 ist implementiert
public class Zahlen {

	public static void main(String[] args) {
		
		int[] zahlen = {3,4,2,3,5,1,2,7,2,1,2,4};
		int meisteZahl = 0;
		int höchsterZähler = 0;
		
		for(int i = 0; i < 10; i++) {
			
			int zähler = 0;
			for(int a = 0; a < zahlen.length; a++) {
				
				if(i == zahlen[a]) {
					zähler++;
				}
				
				if(zähler > höchsterZähler) {
					meisteZahl = i;
					höchsterZähler = zähler;
				}
			}
		}
		
		System.out.print("Meiste Zahl: " + meisteZahl);
		System.out.print("\nAuftreten: " + höchsterZähler);

	}

}
