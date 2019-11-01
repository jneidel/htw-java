
public class Transformation {

	public static void main(String[] args) {

		int basis = 5;
		int exponent = 2;
		int ergebnis = 1;
		int anzahl;
		
		/*
		for (anzahl = 0; anzahl < exponent; ++anzahl) {
			ergebnis = ergebnis * basis;
		}
		*/
		
		
		
		//int anzahl = 0;
		/*
		while(anzahl < exponent) {
			
			ergebnis = ergebnis * basis;
			anzahl++;
			
		}
		*/
		
		/*
		
		do {
			ergebnis = ergebnis * basis;
			anzahl++;
		}while(anzahl < exponent);
		
		*/
		System.out.println(basis + " hoch " + exponent + " = " + ergebnis);
		System.out.println("Anzahl der Durchläufe: " + anzahl);
	}

}
