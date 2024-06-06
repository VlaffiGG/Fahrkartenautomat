import java.util.Scanner;

public class Fallunterscheidung {
	
	public static void main(String[] args) {
		int tage = 0;
		int monat;
		Scanner tastatur = new Scanner(System.in);

		System.out.print("Wie lautet der Monat (1-12): ");
		monat = tastatur.nextInt();

		switch(monat) {
		case 1:
			tage = 31;
			break;
		case 2:
			tage = 28;
			break;
		case 3:
			tage = 31;
			break;
		case 4:
			tage = 30;
			break;
		case 5:
			tage = 31;
			break;
		case 6:
			tage = 30;
			break;
		case 7:
			tage = 31;
			break;
		case 8:
			tage = 31;
			break;
		case 9:
			tage = 30;
			break;
		case 10:
			tage = 31;
			break;
		case 11:
			tage = 30;
			break;
		case 12:
			tage = 31;
			break;
		default:
			tage = 0;
		}
		
		if(tage == 0) {
			System.out.println("Es gibt diesen Monat nicht!");
			tastatur.close();
		}else {
			System.out.printf("Der %d-te Monat im Jahr hat %d Tage.", monat, tage);
			tastatur.close();
		}
	}
}
