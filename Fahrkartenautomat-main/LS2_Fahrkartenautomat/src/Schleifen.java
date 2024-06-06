
public class Schleifen {

	public static void main(String[] args) {
		
		int i = 1;
		while(i <= 20) {
			
			if (i == 18) {
				break;
			}
			if (i == 11) {
				i++;
				continue;
				
			}
			System.out.printf("%d |", i*i);
		    i = i+1;
		    
		}

	}

}
