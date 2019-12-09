package source;

public class ArrayMethoden {

	public static int arrayGet(int[] array, int i) {
		int num = 0;
		
		if(i < Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}
		else {
			for (int j = i; j < array.length; j++) {
				num = array[i];
			}
		}
		return num;
	}
	
	public static int sum (int[] array) {
		int num = 0;
		
		for (int i = 0; i < array.length; i++) {
			num += array[i];
		}
		
		return num;
	}
	
	public static int mittelwert(int[] array) {
		if(array.length <= 0) {
			return 0;
		}
	
		return sum(array)/array.length;
	}
	
	public static int quadrat(int[] array) {
		int num = 1;
		
		for (int i = 0; i < array.length; i++) {
			num *= array[i];
		}
		
		return num;
	}
	
	public static void println(int x) {

		
		System.out.println(x);
	}
	
}