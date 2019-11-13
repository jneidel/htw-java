import java.text.DecimalFormat;
import java.util.Scanner;

import com.sun.java.swing.action.ExitAction;
import com.sun.tools.javadoc.main.Messager.ExitJavadoc;

public class Taschenrechner {

	//#region Calulator Module
	
	
	public static double addieren (double x, double y) {
		return x + y;
	}
	
	public static double subtrahieren(double x, double y) {
		return x - y;
	}
	
	public static double multiplizieren(double x, double y) {
		return x * y;
	}
	
	public static double dividieren(double x, double y) {
		if(y == 0) {
			return 0;
		}
		else {
			return x / y;
		}
	}
	
	//#regionende
	
	public static double zahlEinlesen(int welcheZahl) {

	}
	
	public static char menue() {
		
		System.out.println("\nBitte wählen Sie aus:");
		System.out.println("1 Addition\n2 Subtration\n3 Multiplikation\n4 Division\nn Neue Zahlen\ne Beenden");
		Scanner sc = new Scanner(System.in);
		char read = sc.next().charAt(0);
		return read;
	}


	public static void gibtEregnisAus(double x, double y, char op, double erg) {
		System.out.printf("%4.2f %c %4.2f = %4.2f",x ,op ,y ,erg);
	}
	
	public static void main(String[] args) {
		System.out.println("Taschenrechner");
		System.out.println("==============\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Giben Sie die Zahl 1 ein: ");
		double numberOne = sc.nextDouble();		
		System.out.print("Giben Sie die Zahl 2 ein: ");
		double numberTwo = sc.nextDouble();
		
		char read = menue();
		
			switch (read) {
			case '1':
				//ANSI CODE FÜR DIE 2
				gibtEregnisAus(numberOne, numberTwo, '+', addieren(numberOne, numberTwo));
				break;
			case '2': 
				gibtEregnisAus(numberOne, numberTwo, '-', subtrahieren(numberOne, numberTwo));
				break;
			case '3': 
				gibtEregnisAus(numberOne, numberTwo, '*', multiplizieren(numberOne, numberTwo));
				break;
			case '4': 
				gibtEregnisAus(numberOne, numberTwo, '/', dividieren(numberOne, numberTwo));
				break;
			case 'n':
				menue();
				
				//Neu Abrufen
				break;
			case 'e':
				System.out.println("Program closed");
				System.exit(0);
				//Programm Beenden
				break;
			default:
				System.out.println("Unbekannte Eingabe");
			}
	}

}
