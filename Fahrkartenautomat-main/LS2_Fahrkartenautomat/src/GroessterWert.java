import java.util.Scanner;
public class GroessterWert {

   public static void main(String[] args) {
      Scanner Tastatur = new Scanner(System.in);
      int a, b, c, max;

      // Eingabe
      System.out.print("a: ");
      a = Tastatur.nextInt();
      System.out.print("b: ");
      b = Tastatur.nextInt();
      System.out.print("c: ");
      c = Tastatur.nextInt();
     
      // Verabeitung
      if (a > b || c > b)  {
          if (a > c) {
             max = a;
          }
          else {
             max = c;
         }
      }
      else {
    	  max = b; 
      }
     System.out.println("Der größte eingegebene Wert ist: " + max);
     
     Tastatur.close();
   }
}