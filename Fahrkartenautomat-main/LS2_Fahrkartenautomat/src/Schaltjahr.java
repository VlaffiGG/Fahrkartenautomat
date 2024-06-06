import java.util.Scanner;

public class Schaltjahr {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		
		System.out.print("Geben Sie eine Jahreszahl ein: ");
		int jahreszahl = eingabe.nextInt();
		
		
		if((jahreszahl % 4) == 0) {
				if((jahreszahl % 100) == 0 && jahreszahl > 1582) {
					if((jahreszahl % 400) == 0) {
						System.out.println("Bei dieser Jahreszahl handelt es sich um ein schaltjahr.");
					}else
						System.out.println("Bei dieser Jahreszahl handelt es sich um kein schaltjahr.");
				}
				else {
					System.out.println("Bei dieser Jahreszahl handelt es sich um ein schaltjahr.");
				}
		} else {
			System.out.println("Bei dieser Jahreszahl handelt es sich um kein schaltjahr.");
		}
		eingabe.close();
	}
}