//A6.4.1 ist implementiert
import java.util.Scanner;

public class Volumen {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		
		double würfelParameter = Eingaben(eingabe);
		double ergebnis = Eingaben(würfelParameter);
		
		System.out.printf("Das Volumen des Wuerfels betraegt: %.2f Kubikzentimeter", ergebnis);
		
		eingabe.close();

	}
	
	public static double Eingaben(Scanner scanner) {
		
		System.out.print("Bitte geben Sie die Seitenlaenge des Wuerfels an (in cm): ");
		double seitenlänge = scanner.nextDouble();
		
		System.out.println();

		return seitenlänge;
	}
	
	public static double Eingaben(double seitenlänge) {
		
		double ergebnis = Math.pow(seitenlänge, 3.0);
		
		return ergebnis;
	}
}
