package source;

public class TestArray {

	public static void main(String[] args) {
		ArrayMethoden arrayM = new ArrayMethoden();

		
		int[] myNum = {10,20,30,40}; 
		ArrayMethoden.println(ArrayMethoden.arrayGet(myNum, 2));
		
		ArrayMethoden.println(ArrayMethoden.sum(myNum));
		
		ArrayMethoden.println(ArrayMethoden.mittelwert(myNum));
		
		ArrayMethoden.println(ArrayMethoden.quadrat(myNum));
		
	}

}
