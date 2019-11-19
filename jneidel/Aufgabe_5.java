import java.util.Scanner;

public class Aufgabe_5 {
	public static int getInt(String question) {
		Scanner s = new Scanner(System.in);
		System.out.print( question );
		return s.nextInt();
	}
	
	public static float toCelsius( int fahr ) {
		return (float) ((5.0 / 9.0) * (fahr - 32.0));
	}
	public static int toFahrenheit( float cel ) {
		return (int) ((double) cel * 9.0 / 5.0 + 32.0);
	}
	
	public static void toCelsiusLoop() {
		final int START = getInt( "Start: " );
		final int STEP = getInt( "Step: " );
		final int END = getInt( "End: " );
		System.out.println();
		
		for (int fahrenheit = START; fahrenheit <= END; fahrenheit += STEP) {
			float celsius = toCelsius(fahrenheit);
			System.out.printf( "%3dF %3.2fC\n", fahrenheit, celsius);
		}
	}
	public static void toFahrenheitLoop() {
		final int START = getInt( "Start: " );
		final int STEP = getInt( "Step: " );
		final int END = getInt( "End: " );
		System.out.println();
		
		for (float celsius = START; celsius <= END; celsius += STEP) {
			int fahrenheit = toFahrenheit(celsius);
			System.out.printf( "%3.2fC %3dF\n", celsius, fahrenheit);
		}
	}
	
	public static void main(String[] args) {
		int wahl=0;
		 while(wahl !=3) {
			 System.out.println( "\n1 fahrenheit to celsius\n2 celsius to fahrenheit\n3 exit" );
			 wahl = getInt("exec: ");
			 
			 switch(wahl) {
			 case 1:
				 toCelsiusLoop();
				 break;
			 case 2:
				 toFahrenheitLoop();
				 break;
			 case 3:
				 break;
			 default:
				 System.out.println( "Invalid choice." );
			 }
		 }
	}
	
  /*
   * Required implementations
   */
	public static int auswahl() {
		getInt( "Welche Auswahl soll vorgenommen werden" );
	}
	public static void celsiusUmrechnung() {
		toFahrenheitLoop();
	}
	public static void fahrenheitUmrechnung() {
		toCelsiusLoop();
	}
	public static float celsiusToFahrenheit(int celsius) {
		return toFahrenheit(celsius);
	}
	public static int fahrenheitToCelsius (int fahrenheit) {
		return toCelsius(fahrenheit);
	}
}
