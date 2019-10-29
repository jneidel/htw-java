public class Aufgabe_2_5 {
  public static void main( String[] args ) {
		final double PI = 3.141592; 
		int u = 40;
		int h = 15;
    System.out.printf( "Umfang: u = %d\n", u );
    System.out.printf( "Höhe: h = %d\n\n", h );

		double dboden = u/PI;
		double fboden = PI * Math.pow( (dboden/2), 2 );
    double fmantel = u*h;
    double fgesamt = 2*fboden+fmantel;
    double v = fboden*h;

    System.out.printf( "Durchmesser des Dosenbodens: dboden = %.3f\n", dboden );
    System.out.printf( "Fläche des Dosenbodens: fboden = %.0f\n", fboden );
    System.out.printf( "Mantelfläche der Dose: fmantel = %.0f\n", fmantel );
    System.out.printf( "Gesamtfläche der Dose: fgesamt = %.0f\n", fgesamt );
    System.out.printf( "Volumen der Dose: v = %.0f\n", v );
  }
}
