//A5.5.3 ist implementiert

import java.util.Scanner;

public class Zinseszins {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		
		int laufzeit = 0;
		double kapital = 0;
		double zinssatz = 0;
		double kapitalNachJahren = 0;
		
		System.out.print("Bitte geben Sie die Laufzeit des Vertrags ein: ");
		laufzeit = eingabe.nextInt();
		
		System.out.print("Bitte geben Sie ein, wie viel Kapital Sie anlegen wollen: ");
		kapital = eingabe.nextDouble();
		double eingezahlt = kapital;
		
		System.out.print("Bitte geben Sie den Zinssatz ein: ");
		zinssatz = eingabe.nextDouble();
		
		kapitalNachJahren = kapital * Math.pow(1 + (zinssatz / 100), laufzeit);
		
		System.out.println("Ihr eingezahltes Kapital: " + eingezahlt);
		System.out.printf("Ausgezahltes Kapital: %.2f", kapitalNachJahren);
		
		eingabe.close();
	}

}
