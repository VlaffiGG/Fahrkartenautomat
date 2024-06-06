import java.io.Console;
import java.util.Scanner;


//A4.3 wurde implementiert
public class Fahrplan {
	public static void main(String[] args) {
		
		// Weichestellungen
        int fahrzeit = 0;
        char haltInSpandau = 'n';
        char richtungHamburg = 'n';
        char haltInStendal = 'j';
        char endetIn = 'h';

        fahrzeit = fahrzeit + 8; // Fahrzeit Hbf -> Spandau

        if (haltInSpandau == 'j') {
            fahrzeit = fahrzeit + 2; // Halt in Spandau
        }
        
        if(richtungHamburg == 'j') {
        	fahrzeit += 96; 
        }
        
        if(haltInStendal == 'j') {
        	fahrzeit += (34 + 16);
        } else {
        	fahrzeit += (34 + 6);
        }
        
        if(endetIn =='h') {
        	fahrzeit += 62;
        	System.out.println("Sie erreichen Hannover nach " + fahrzeit + " Minuten.");
        } else if(endetIn == 'b') {
        	fahrzeit += 50;
        	System.out.println("Sie erreichen Braunschweig nach " + fahrzeit + " Minuten.");
        } else if(endetIn == 'w') {
        	fahrzeit += 29;
        	System.out.println("Sie erreichen Wolfsburg nach " + fahrzeit + " Minuten.");
        }
	}
}
