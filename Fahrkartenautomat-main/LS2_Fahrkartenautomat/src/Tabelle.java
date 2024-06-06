
public class Tabelle {
	public static void main(String[] args) {
		String fahrenheit = "Fahrenheit";
		String celsius = "Celsius";
		String spaltentrennung = "-------------------------";
		
		int fahrenheit1 = -20;
		int fahrenheit2 = -10;
		int fahrenheit3 = 0;
		int fahrenheit4 = 20;
		int fahrenheit5 = 30;
		double celsius1 = -28.89;
		double celsius2 = -23.33;
		double celsius3 = -17.78;
		double celsius4 = -6.67;
		double celsius5 = -1.11;
		
		System.out.printf(" %-12s | %10s \n %s \n %-12d | %10.2f \n %-12d | %10.2f \n %+-12d | %10.2f \n %+-12d | %10.2f \n %+-12d | %10.2f", fahrenheit, celsius, spaltentrennung, fahrenheit1, celsius1, fahrenheit2, celsius2, fahrenheit3, celsius3, fahrenheit4, celsius4, fahrenheit5, celsius5 );
	}
}
