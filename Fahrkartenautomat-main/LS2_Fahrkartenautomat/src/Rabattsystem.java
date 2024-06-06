import java.util.Scanner;

public class Rabattsystem {
	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		double ausgabe;
		boolean wiederholung = true;
		
		while(wiederholung) {
		
			System.out.print("Bitte geben Sie Ihren Bestellwert ein: ");
			double bestellwert = eingabe.nextDouble();
			if(bestellwert < 0) {
				System.out.println(">>ungueltiger Betrag!");
			} else {
				double rabatt = (bestellwert / 100) * Rabattierung(bestellwert);
				ausgabe = bestellwert - rabatt;
				ausgabe = Math.round(ausgabe * 100) / 100.0;
				
				System.out.println("Der Bestellwert abzueglich Rabatt betraegt: " + ausgabe + " EUR");
			}
			System.out.println();
			eingabe.close();
		}
	}
	
	private static int Rabattierung(double bestellwert) {
		int rabatt = 0;
		
		if(bestellwert <= 100) {
			rabatt = 10;
		} else if(bestellwert > 100 && bestellwert <= 500) {
			rabatt = 15;
		} else if(bestellwert > 500) {
			rabatt = 20;
		}
		
		return rabatt;
	}
}
