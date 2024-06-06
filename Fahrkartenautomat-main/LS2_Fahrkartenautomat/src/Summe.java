import java.util.Scanner;

public class Summe {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		
		int summe = 0;
		
		System.out.print("Geben Sie eine beliebige Ganzzahl ein: ");
		int ganzzahl = eingabe.nextInt();
		System.out.print("Die Zahlen werden addiert: \n\n");
		
		for(int i = 1; i <= ganzzahl; i++) {
			System.out.println(i);
			summe += i;
		}
		
		System.out.println("\nDie Summe beträgt: " + summe);
		
		eingabe.close();
	}

}
