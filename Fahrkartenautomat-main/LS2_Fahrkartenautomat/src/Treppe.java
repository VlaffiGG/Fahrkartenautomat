//A5.5.5 ist implementiert

import java.util.Scanner;

public class Treppe {
	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		int wiederholung = 1;
		
		System.out.print("Treppenhöhe: ");
		int höhe = eingabe.nextInt();
		
		System.out.print("Stufenbreite: ");
		int stufenBreite = eingabe.nextInt();
		System.out.println();
		
		int maße = höhe * stufenBreite;
		
		for(int i = 0; i < höhe; i++) {
			for(int o = 0; o < (maße - (stufenBreite * wiederholung)); o++) {
				System.out.print(" ");
			}
			for(int a = 0; a < wiederholung; a++) {
				for(int u = 0; u < stufenBreite; u++) {
					//Treppenstufe bearbeiten; mit System.out.print() funktioniert es, ist aber auf der falschen Seite
					//vorher Variable string definieren bei der HIER immer ein Char hinzugefügt wird
					char stern = '*';
					System.out.printf("%c", stern);
					
				}
			}
			
			System.out.println();			
			wiederholung++;
		}
		
		eingabe.close();
	}
}
