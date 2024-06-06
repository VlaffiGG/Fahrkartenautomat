//A 7.4.1 ist implementiert

import java.util.Scanner;

public class Suche {

	public static void main(String[] args) {
		
		Scanner eingabe = new Scanner(System.in);
		boolean richtigeZahl = false;
		
		int[] array1 = new int[8];
		
		for(int i = 0; i < array1.length; i++) {
			
			array1[i] = (int) (Math.random() * 100);
			
		}
		
		System.out.print("Geben Sie eine Zahl (0-100) ein, die Sie im Array vermuten: ");
		int zahl = eingabe.nextInt();
		
		for(int i = 0; i < array1.length; i++) {
			
			if(zahl == array1[i]) {
				richtigeZahl = true;
			}
			
		}
		
		if(richtigeZahl) {
			System.out.print("\n\nHerzlichen Glückwunsch!\nIhre Zahl ist im Array vorhanden!\n\n");
		}else {
			System.err.print("\n\nIhre Zahl ist nicht im Array vorhanden gewesen!\n\n");
		}
		
		System.out.print("Folgende Zahlen sind im Array vorhanden:\n");
		
		for(int i = 0; i < array1.length; i++) {
			
			System.out.println("	" + array1[i]);
			
		}
		
		eingabe.close();
	}

}
