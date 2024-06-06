//A7.4.4 ist implementiert

public class SelectionSort {

	public static void main(String[] args) {
		
		int kleinsterWert = 0;
		int index = 0;
		int[] liste = { 4, 2, 10, 3, -5, 0, 17 };
		
		for(int i = 0; i < liste.length - 1; i++) {
			
			kleinsterWert = liste[i];
			index = i;
			
			for(int a = i; a < liste.length;a++) {
				
				if(liste[a] < kleinsterWert) {
					kleinsterWert = liste[a];
					index = a;
				}
			}
			
		 	int zwischenspeicher = liste[i];
			liste[i] = liste[index];
			liste[index] = zwischenspeicher;
		}
		
		for(int i = 0; i < liste.length; i++) {
			System.out.print(Integer.toString(liste[i]) + " ");
		}
	}
}
