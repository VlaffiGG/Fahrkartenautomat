//A5.5.4 ist implementiert

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		int a = 0;
		
		System.out.print("Geben Sie eine Zahl zwischen 2 und 9 ein: ");
		int zahl = eingabe.nextInt();
		
		for(int i = 0; i < 100; i++) {
			if(i % zahl == 0 || Integer.toString(i).contains(Integer.toString(zahl))) {
				System.out.print("*  ");
			}else if(i > 9 && Quersumme(i) == zahl) {
				System.out.print("*  ");
			}
			else{
				System.out.print(i + "  ");
			}
			
			if(a == 9) {
				System.out.println();
				a = -1;
			}
			
			a++;
		}
		
		eingabe.close();
	}
	
	public static int Quersumme(int ziffer) {
		int u = 0;
		String zahl = Integer.toString(ziffer);
		char[] zahlen = zahl.toCharArray();
		for(int i = 0; i < 2; i++) {
			int reverse = Character.getNumericValue(zahlen[i]);
			u = u + reverse;
		}
		
		return u;
	}
}
