import java.util.Scanner;

public class Rom {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		
		String zwischenspeicher = "";
		
		System.out.print("Geben sie eine roemische Zahl ein: ");
		String rom = eingabe.next();
		
		for(int i = 0; i < rom.length(); i++) {
			char c = rom.charAt(i);
			
			if(c == 'I') {
				zwischenspeicher += "1 ";
			} else if(c == 'V') {
				zwischenspeicher += "5 ";
			} else if(c == 'X') {
				zwischenspeicher += "10 ";
			}else if(c == 'L') {
				zwischenspeicher += "50 ";
			}else if(c == 'C') {
				zwischenspeicher += "100 ";
			} else if(c == 'D') {
				zwischenspeicher += "500 ";
			} else if(c == 'M') {
				zwischenspeicher += "1000 ";
			}
		}
		
		String splits[] = zwischenspeicher.split(" ");
		int a = 1;
		int ausgabe = 0;
		
		if(Integer.parseInt(splits[0]) >= Integer.parseInt(splits[1])) {
		ausgabe += Integer.parseInt(splits[0]);
		}
		for(int i = 0; i < splits.length; i++) {
			
			int erste = Integer.parseInt(splits[i]);
			int zweite = Integer.parseInt(splits[a]);
			
			
			if((a + 1) == splits.length) {
				if(erste > zweite) {
					ausgabe += zweite;
					a++;
				}	
			}else {
				boolean kleiner = zweite < Integer.parseInt(splits[(a + 1)]);
				if(erste > zweite && kleiner) {
				ausgabe += (Integer.parseInt(splits[(a + 1)]) - zweite);
				a++;
				a++;
				} else if(erste > zweite && !kleiner) {
					ausgabe += zweite;
					a++;
				}
			} 
			
			if(erste < zweite) {
				ausgabe += (zweite - erste);
				a++;
			} else if(erste == zweite) {
				ausgabe += zweite;
				a++;
			}
			
			if(a == splits.length) {
				break;
			}
		}
		
		System.out.println(ausgabe);
		eingabe.close();
	}

}
