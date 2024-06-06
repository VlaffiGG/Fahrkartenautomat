//A 6.4.4 ist implementiert

import java.util.Scanner;

public class Urlaub {

	public static void main(String[] args) {
		
		Scanner eingabe = new Scanner(System.in);
		double startbudget = 0;
		boolean falscheEingabe = true;
		boolean genugGeld = true;
		double budget = 0;
		boolean freigabe = false;
		double eintauschen = 0;
		String land = "";
		
		System.out.print("Hoehe des Startbudgets: ");
		startbudget = eingabe.nextDouble();
		budget = startbudget;
		
		while(genugGeld) {
			
			while(!freigabe) {
				System.out.print("In welches Land wollen Sie? ");
				land = eingabe.next();
				
				
				switch(land) {
				
				case "usa":
					freigabe = true;
					break;
					
				case "japan":
					freigabe = true;
					break;
					
				case "england":
					freigabe = true;
					break;
					
				case "schweiz":
					freigabe = true;
					break;
					
				case "dänemark":
					freigabe = true;
					break;
					
				default:
					System.out.printf("Es kam zu einem Fehler! \nBitte wiederholen Sie Ihre Eingabe!\n");
					break;
					}
				}
			
			while(falscheEingabe) {
				System.out.printf("\nAktuelles Budget: %.2f\n", budget);
				System.out.printf("Wie viel Euro wollen Sie tauschen? ");
				try {
					eintauschen = eingabe.nextDouble();				
				
					if(eintauschen > budget) {
						System.err.print("\nFEHLER: Sie wollen mehr Geld eintasuchen als Ihr Budget betraegt!\n");
					}
					else {
						falscheEingabe = false;
					}
				}catch(Exception ex) {
					System.err.print("FEHLER: Keine gültige Eingabe!");
				}
			}
			
			Verarbeitung(land, eintauschen);
			
			budget -= eintauschen;
			
			if(budget < (startbudget / 100 * 10)) {
				System.out.print("Hinweis: Ihr Budget ist unter 10% gefallen!\n");
				boolean richtigeEingabe = true;
				
				while(richtigeEingabe) {
					System.out.print("Wollen Sie es aufladen? (ja/nein) ");
					String aufladen = eingabe.next();
					
					if(aufladen.contains("nein")) {
						genugGeld = false;
						richtigeEingabe = false;
						System.err.print("\nViel Spass auf der Heimreise!"); 
					}
					else if(aufladen.contains("ja")) {
						System.out.print("\nWie viel Euro wollen Sie aufladen? ");
						double aufladung = eingabe.nextDouble();
						budget += aufladung;
						startbudget = budget;
						System.out.print("\nIhr neues Budget betraegt: " + budget + " Euro\n\n");
						richtigeEingabe = false;
					}
					else {
						System.err.print("FEHLER: Keine gültige Eingabe!");
					}
				}
			}
			
			falscheEingabe = true;
			freigabe = false;
		}
		
		
		eingabe.close();
	}
	
	public static void Verarbeitung(String land, double euro) {
		
		land = land.toLowerCase();
		
		switch(land) {
		
		case "usa":
			double dollar = euro * 0.98;
			System.out.printf("Sie erhalten: %.2f USD", dollar);
			break;
			
		case "japan":
			double yen = euro * 141; 
			System.out.printf("Sie erhalten: %.2f JPY\n\n", yen);
			break;
			
		case "england":
			double pfund = euro * 0.88;
			System.out.printf("Sie erhalten: %.2f GBP\n\n", pfund);
			break;
			
		case "schweiz":
			double franken = euro * 0.96;
			System.out.printf("Sie erhalten: %.2f CHF\n\n", franken);
			break;
			
		case "dänemark":
			double kronen = euro * 7.44;
			System.out.printf("Sie erhalten: %.2f DKK\n\n", kronen);
			break;
			
		default:
			System.out.printf("Es kam zu einem Fehler! \nBitte wiederholen Sie Ihre Eingabe!");
			break;
		}
	}
}
