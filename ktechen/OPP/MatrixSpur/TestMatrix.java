package OPP.MatrixSpur;

public class TestMatrix {

	public static void main(String[] args) {
		
		double[][] matrixA = {{3, 6, 2, 5, 9},{0, 5, 7, 2, 2},{3, 6, 7, 8, 2},{5, 7, 1, 6, 4},{1, 9, 3, 2, 6}};
		double[][] matrixB = {{3, 6, 2, 5, 9},{0, 5, 7, 2, 2},{3, 6, 7, 8, 2},{5, 7, 1, 6, 4}};
		double[][] matrixC = {{3, 6, 2, 5, 9}};
		double[][] matrixD = {{1, 2},{3, 4, 5}};
		double[][] matrixE = {{3, 6, 2},{0, 5, 7},{3, 6, 7}};
		double[][] matrixF = {{3, 6, 2, 5},{0, 5, 7, 3},{3, 6, 7, 2},{0, 5, 7, 3}};
		double[][] matrixG = null;

		
		try {
			System.out.println("Result: " + MatrixUtils.trace(matrixA));
			System.out.println();
			System.out.println("Result: " + MatrixUtils.trace(matrixB));
			System.out.println();
			System.out.println("Result: " + MatrixUtils.trace(matrixC));
			System.out.println();
			System.out.println("Result: " + MatrixUtils.trace(matrixD));
			System.out.println();
			System.out.println("Result: " + MatrixUtils.trace(matrixE));
			System.out.println();
			System.out.println("Result: " + MatrixUtils.trace(matrixF));
			System.out.println();
			System.out.println("Result: " + MatrixUtils.trace(matrixG));
			System.out.println();
		}catch (NullPointerException e) {
			System.out.println(e.getMessage());	
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
