/**
 * Abgabe 3 BMIBerechnung (nicht bewertet)
 * @author Jonathan Neidel
 * Team: 32
 * 
 * Beschreibung: kurze Beschreibung der Funktion des Programms
 */
import java.util.Scanner; 

public class Aufgabe_3 {
  public static double groesseEingeben() {
    Scanner scan = new Scanner(System.in);
    System.out.print( "Körpergröße in cm: " );
    double d = scan.nextDouble();
    return d;
  }
  public static char geschlechtEingeben() {
    Scanner scan = new Scanner(System.in);

    char c;
    while ( true ) {
      System.out.print( "Geschlecht (m/w): " );
      c = scan.next().charAt(0);
      if ( c == 'm' || c == 'w' )
        break;
    }
    return c;
  }
  public static double gewichtEinlesen() {
    Scanner scan = new Scanner(System.in);
    System.out.print( "Gewicht in kg: " );
    double g = scan.nextDouble();
    return g;
  }

  public static String bmi(double height, char geschlecht, double gewicht) {
    double bmi = gewicht / Math.pow( height / 100, 2 );

    System.out.println( bmi );
    
    String klassifikation = "";
    switch( geschlecht ) {
      case 'm':
        if ( bmi < 20 ) {
          klassifikation = "Untergewicht";
        } else if ( bmi >= 20 && bmi <= 25 ) {
          klassifikation = "Normalgewicht";
        } else if ( bmi >= 26 && bmi <= 30 ) {
          klassifikation = "Übergewicht"; 
        } else if ( bmi >= 31 && bmi <= 40 ) {
          klassifikation = "Adipositas";
        } else if ( bmi > 40 ) {
          klassifikation = "massive Adipositas";
        }
        break;
      case 'w':
        if ( bmi < 19 ) {
          klassifikation = "Untergewicht";
        } else if ( bmi >= 19 && bmi <= 24 ) {
          klassifikation = "Normalgewicht";
        } else if ( bmi >= 25 && bmi <= 30 ) {
          klassifikation = "Übergewicht"; 
        } else if ( bmi >= 31 && bmi <= 40 ) {
          klassifikation = "Adipositas";
        } else if ( bmi > 40 ) {
          klassifikation = "massive Adipositas";
        }
        break;
    }

    return klassifikation;
  }
  
  public static void main(String[] args) {
    double height = groesseEingeben();
    char geschlecht = geschlechtEingeben();
    double gewicht = gewichtEinlesen();

    System.out.println( bmi( height, geschlecht, gewicht ) );
  }
}
