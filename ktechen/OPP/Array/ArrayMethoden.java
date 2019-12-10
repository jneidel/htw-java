package OPP.Array;

public class ArrayMethoden {

	/*
	 * Outcome of all function
	 */
	public static void printArrayInformation(int[] array,int ArrayAnStelleX)
	{	
		final String BORDER = "#==============================================================================================#";
		
		System.out.println(BORDER);
		
		System.out.printf("| Array der Zahl x            :  %d\n", ArrayMethoden.arrayGet(array, ArrayAnStelleX), "|");
		System.out.printf("| Summe                       :  %d\n", ArrayMethoden.sum(array));
		System.out.printf("| Mittelwert                  :  %d\n", ArrayMethoden.mittelwert(array));
		System.out.printf("| Anzahl der Geradenzahlen    :  %d\n", ArrayMethoden.countGeradeZahl(array));
		System.out.printf("| Zwei größste Zahl           :  %d\n", ArrayMethoden.zweiGroesssteZahl(array));
		System.out.printf("| Größste Zahl                :  %d\n", ArrayMethoden.max(array));
		System.out.printf("| Kleinste Zahl               :  %d\n", ArrayMethoden.min(array));
		System.out.print("| Alle Arrays in Quadrat      :  ");
		/*
		 * VOID
		 */
		ArrayMethoden.quadrat(array);
		
		System.out.println();
		System.out.print("| Alle Geraden Arrays         :  ");

		ArrayMethoden.geradeZahl(array);
	
		System.out.println();
	
		System.out.println(BORDER);
	}
	/*
	 * Search a int from Array
	 */
	private static int arrayGet(int[] array, int i) {
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
	
	/*
	 * Addiert das Array zusammen
	 */
	private static int sum (int[] array) {
		int num = 0;
		
		for (int i = 0; i < array.length; i++) {
			num += array[i];
		}
		
		return num;
	}
	
	/*
	 * Mittelwert
	 */
	private static int mittelwert(int[] array) {
		if(array.length <= 0) {
			return 0;
		}
	
		return sum(array)/array.length;
	}
	
	/*
	 * quadrat das Array
	 */
	private static void quadrat(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.print((int)Math.pow(arrayGet(array, i),2) + " ");
		}
		
	}
	
	/*
	 * Größste Zahl
	 */
	private static int max(int[] array) {
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < array.length; i++) {	
			if(max < array[i]) {
				max = arrayGet(array, i);
			}
		}
		
		return max;
	}
	
	/*
	 * kleinste Zahl
	 */
	private static int min(int[] array) {
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < array.length; i++) {	
			if(min > array[i]) {
				min = arrayGet(array, i); 
			}
		}
		return min;
	}
	
	/*
	 * Zahlen des Array sind Gerade
	 */
	private static void geradeZahl(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if(array[i]%2 == 0) {
				System.out.print(arrayGet(array, i) + " ");	
			}
		}
	}

	/*
	 * Anzahl der Geradenzahlen
	 */
	private static int countGeradeZahl(int[] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i]%2 == 0) {
				count++;	
			}
		}
		
		return count;
	}
	
	private static int zweiGroesssteZahl(int[] array) {
		int max = max(array);
		int placetwo = 0;
		
		for (int i = 0; i < array.length; i++) {
			if(max > array[i]) {
				placetwo = array[i];
			}
		}
		
		return placetwo;
	}
	
}
