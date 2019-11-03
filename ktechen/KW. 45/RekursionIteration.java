package HomeWork;

public class RekursionIteration {

	/*
	public static int Aufruf(int n) {
		if (n > 1) {
			return n + Aufruf(n - 1);
		}
		else {
			return 1;
		}
	}
	
	*/
	
	public static int Aufruf(int n) {
		
		int output = 0;
		
		for (int i = 1; i <= n; i++) {
			output = i + n - 1;
		}
		return output;
	}
	
	public static void main(String[] args) {
		System.out.println("Ergebnis: " + Aufruf(8));
	}
}
