//A6.4.3 ist implementiert

import java.util.Scanner;

public class PC_Haendler {

    public static void main(String[] args) {

        Scanner tastatur = new Scanner(System.in);

        // Eingabe
        String frage = "Was moechten Sie bestellen: ";
        String artikel = Liesstring(tastatur, frage);

        frage = "Geben Sie die Anzahl ein: ";
        int anzahl = liesInt(tastatur, frage);

        frage = "Geben Sie den Nettopreis ein: ";
        double nettopreis = liesDouble(tastatur, frage);

        frage = "Geben Sie den Mehrwertsteuersatz in Prozent ein: ";
        double mwst = liesDouble(tastatur, frage);

        // Verarbeitung
        double nettogesamtpreis = berechneNettopreis(anzahl, nettopreis);
        double bruttogesamtpreis = berechneBruttopreis(nettogesamtpreis, mwst);

        // Ausgabe
        System.out.println("\nRechnung");
        rechungausgeben(artikel, anzahl, nettogesamtpreis, 0, mwst);
        rechungausgeben(artikel, anzahl, nettogesamtpreis, bruttogesamtpreis, mwst);

        tastatur.close();
    }
    
    public static String Liesstring(Scanner tastatur, String text) {
    	
    	System.out.print(text);
        String artikel = tastatur.next();
    	
    	return artikel;
    }
    public static int liesInt(Scanner tastatur, String text) {
    	
    	System.out.print(text);
    	int anzahl = tastatur.nextInt();
    	
    	return anzahl;
    }
    public static double liesDouble(Scanner tastatur, String text) {
    	
    	System.out.print(text);
    	double nettopreis = tastatur.nextDouble();
    	
    	return nettopreis;
    }
    public static double berechneNettopreis(int anzahl, double nettopreis) {
    	
    	double nettogesamtpreis = anzahl * nettopreis;
    	
    	return nettogesamtpreis;
    }
    public static double berechneBruttopreis(double nettogesamtpreis, double mwst) {
    	
    	double bruttopreis = nettogesamtpreis * (1 + mwst / 100);
    	
    	return bruttopreis;
    }
    public static void rechungausgeben(String artikel, int anzahl, double nettogesamtpreis, double bruttogesamtpreis, double mwst) {
    	if(bruttogesamtpreis == 0) {
    		System.out.printf("Netto:  %-20s %6d %10.2f %n", artikel, anzahl, nettogesamtpreis);
    	}
    	else {
    		System.out.printf("Brutto: %-20s %6d %10.2f (%.1f%s)%n", artikel, anzahl, bruttogesamtpreis, mwst, "%");
    	}
    }
}