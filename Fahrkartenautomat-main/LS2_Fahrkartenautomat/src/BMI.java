import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		
		System.out.print("Bitte geben Sie ihr Körpergewicht ein (in kg): ");
		int gewicht = eingabe.nextInt();
		
		System.out.print("Bitte geben Sie Ihre Körpergröße ein (in cm): ");
		double größe = eingabe.nextDouble();
		
		System.out.print("Bitte geben Sie Ihr Geschlecht ein (m/n): ");
		char geschlecht = eingabe.next().charAt(0);
		System.out.println();
		
		double bmi = gewicht / Math.pow((größe / 100), 2);
		bmi = Math.round(bmi * 100) / 100.0;
		
		if(geschlecht == 'm') {
			if(bmi < 20){
				System.out.println("Sie haben Untergewicht. || BMI: " + bmi);
			} else if(bmi > 20 && bmi <= 25) {
				System.out.println("Sie haben Normalgewicht. || BMI: " + bmi);
			} else {
				System.out.println("Sie haben Übergewicht. || BMI: " + bmi);
			}
		}else {
			if(bmi < 19){
				System.out.println("Sie haben Untergewicht. || BMI: " + bmi);
			} else if(bmi > 19 && bmi <= 24) {
				System.out.println("Sie haben Normalgewicht. || BMI: " + bmi);
			} else {
				System.out.println("Sie haben Übergewicht. || BMI: " + bmi);
			}
		}
		
		eingabe.close();
	}

}
