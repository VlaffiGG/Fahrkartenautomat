//4.6 ist implementiert
//5.3 ist implementiert
//5.4 ist implementiert

import java.util.Scanner;

class Fahrkartenauswahl {
	public static void main(String[] args) {

		Scanner tastatur = new Scanner(System.in);

		double zuZahlenderBetrag = 0;
		double eingezahlterGesamtbetrag;
		double eingeworfeneMuenze;
		double rueckgabebetrag;
		double nochZuZahlen;
		boolean mehr = true;
		double endPreis = 0;
		
		System.out.println("Fahrkartenbestellvorgang: \n");
		System.out.print("===================================\n \n");
		
		
		while(mehr) {
			System.out.println("Wählen Sie ihre Fahrkarte für Berlin AB aus:");
			System.out.println("	Kurzstrecke AB [2,00 EUR] (1)");
			System.out.println("	Einzelfahrschein AB [3,00 EUR] (2)");
			System.out.println("	Tageskarte AB [8,00 EUR] (3)");
			System.out.println("	4-Fahrten-Karte AB [9,40 EUR] (4)\n");

			System.out.print("Ihre Wahl: ");
			int eingabe = Integer.parseInt(tastatur.next());
		
			while(eingabe < 1 || eingabe > 4) {
				System.out.println(">>ungültige Eingabe!<< \n");
			
				System.out.print("Ihre Wahl: ");
				eingabe = Integer.parseInt(tastatur.next());
				System.out.println();
			}
		
			switch(eingabe) {
			case 1:
				zuZahlenderBetrag = 2.00;
				break;
			case 2:
					zuZahlenderBetrag = 3.00;
					break;
			case 3:
					zuZahlenderBetrag = 8.00;
					break;
			case 4:
					zuZahlenderBetrag = 9.40;
					break;
			}
		
			// Anzahl der Farkarten eingebn
			System.out.print("Anzahl der Fahrkarten: ");
			byte anzahlFahrkarten = tastatur.nextByte();
			if(anzahlFahrkarten < 0 || anzahlFahrkarten > 10) {
				anzahlFahrkarten = 1;
				System.out.println("Fehlerhafte Eingabe - Anzahl der Tickets wird auf 1 gesetzt!");
			}
			
			endPreis += zuZahlenderBetrag * anzahlFahrkarten;
			zuZahlenderBetrag = 0;
			
			System.out.print("Haben Sie vor weitere Fahrkarten zu bestellen? (ja/nein): ");
			String fahrkarten = tastatur.next();
			System.out.println();
			String weitereFahrkarten = fahrkarten.toLowerCase();
			
			while(!weitereFahrkarten.contains("ja") && !weitereFahrkarten.contains("nein")) {
				System.out.println("Geben Sie eine gültige Auswahl ein!\n");
				System.out.print("Haben Sie vor weitere Fahrkarten zu bestellen? (ja/nein): ");
				System.out.println();
				weitereFahrkarten = tastatur.next().toLowerCase();
				if(weitereFahrkarten.contains("ja") || weitereFahrkarten.contains("nein")) {
					break;
			}
			}
			if(weitereFahrkarten.contains("nein")) {
				mehr = false;
			}
		}

		// Geldeinwurf
		eingezahlterGesamtbetrag = 0.0;
		nochZuZahlen = 0.0;
		while (eingezahlterGesamtbetrag < endPreis) {
			nochZuZahlen = endPreis - eingezahlterGesamtbetrag;
			System.out.printf("Noch zu zahlen: %.2f Euro \n", nochZuZahlen);
			System.out.print("Eingabe (mind. 5 Cent, höchstens 20 Euro-Schein): ");
			eingeworfeneMuenze = tastatur.nextDouble();
			if(eingeworfeneMuenze == 0.05 || eingeworfeneMuenze == 0.10 || eingeworfeneMuenze == 0.20 || eingeworfeneMuenze == 0.50 || eingeworfeneMuenze == 1 || eingeworfeneMuenze == 2 || eingeworfeneMuenze == 5 || eingeworfeneMuenze == 10 || eingeworfeneMuenze == 20) {
			eingezahlterGesamtbetrag = eingezahlterGesamtbetrag + eingeworfeneMuenze;
			}else {
				System.out.println(">> Kein gueltiges Zahlungsmittel!");
			}
		}
		
		// Fahrscheinausgabe
		System.out.println("\nFahrschein wird ausgegeben");
		for (int i = 0; i < 8; i++) {
			System.out.print("=");
			try {
				Thread.sleep(200);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n\n");
		
		// Rückgelberechnung und Ausgabe
		rueckgabebetrag = eingezahlterGesamtbetrag - endPreis;
		rueckgabebetrag = Math.round(rueckgabebetrag * 100) / 100.0;
		
		if (rueckgabebetrag > 0.0) {
			System.out.printf("Der Rückgabebetrag in Höhe von: %.2f Euro ", rueckgabebetrag);
			System.out.println("wird in folgenden Münzen ausgezahlt:");

			while (rueckgabebetrag >= 2.0) { // 2-Euro-Münzen
				System.out.println("2 Euro");
				rueckgabebetrag = rueckgabebetrag - 2.0;
				rueckgabebetrag = Math.round(rueckgabebetrag * 100) / 100.0;
			}
			while (rueckgabebetrag >= 1.0) { // 1-Euro-Münzen
				System.out.println("1 Euro");
				rueckgabebetrag = rueckgabebetrag - 1.0;
				rueckgabebetrag = Math.round(rueckgabebetrag * 100) / 100.0;
			}
			while (rueckgabebetrag >= 0.5) { // 50-Cent-Münzen
				System.out.println("50 Cent");
				rueckgabebetrag = rueckgabebetrag - 0.5;
				rueckgabebetrag = Math.round(rueckgabebetrag * 100) / 100.0;
			}
			while (rueckgabebetrag >= 0.2) { // 20-Cent-Münzen
				System.out.println("20 Cent");
				rueckgabebetrag = rueckgabebetrag - 0.2;
				rueckgabebetrag = Math.round(rueckgabebetrag * 100) / 100.0;
			}
			while (rueckgabebetrag >= 0.1) { // 10-Cent-Münzen
				System.out.println("10 Cent");
				rueckgabebetrag = rueckgabebetrag - 0.1;
				rueckgabebetrag = Math.round(rueckgabebetrag * 100) / 100.0;
			}
			while (rueckgabebetrag >= 0.05) { // 5-Cent-Münzen
				System.out.println("5 Cent");
				rueckgabebetrag = rueckgabebetrag - 0.05;
				rueckgabebetrag = Math.round(rueckgabebetrag * 100) / 100.0;
			}
		}

		System.out.println("\nVergessen Sie nicht, den Fahrschein\n" + "vor Fahrtantritt entwerten zu lassen!\n"
				+ "Wir wünschen Ihnen eine gute Fahrt.");

		tastatur.close();
	}
}