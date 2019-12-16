package OPP.MatrixSpur;

public class MatrixUtils {
	
	private int rows = 5; //zeilen
	private int columns = 5; //spalten
	private double[][] matrix = new double [rows][columns]; 
	
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	public double[][] getMatrix() {
		return matrix;
	}

	/*
	 * check and scan Matrix for 
	 */
	public static double trace(double[][] matrix) throws NullPointerException {
		System.out.println("Array: "); //box start 
		
		if(matrix == null) { throw new NullPointerException("Array is null"); }
		
		int row = 0; //zeile
		int column = 0; //spalte
		double result = 0; 
		
		for (int i = 0; i < matrix.length; i++) {
			row = i + 1;
			for (int j = 0; j < matrix[i].length; j++) {
				column = j + 1;
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		//System.out.println(row + " " + column);
		
		//if(row == column) { System.out.println("Es wurde ein quadratisches Array übergeben.");  } /*quadratisch */ 
		if(row != column) { 
			System.out.println("Es wurde kein quadratisches Array übergeben."); 
		} /*rechtecking*/ 
		else{
			
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					if(i == j) {
						result += matrix[i][j];
					}
				}
			}
			//System.out.println("Test: " + result);
			
			/*
			if(row == 5 && column == 5) {result = matrix[0][0] + matrix[1][1] + matrix[2][2] + matrix[3][3] + matrix[4][4];}
			if(row == 4 && column == 4) {result = matrix[0][0] + matrix[1][1] + matrix[2][2] + matrix[3][3];}
			if(row == 3 && column == 3) {result = matrix[0][0] + matrix[1][1] + matrix[2][2];}
			if(row == 2 && column == 2) {result = matrix[0][0] + matrix[1][1];}
			if(row == 1 && column == 1) {result = matrix[0][0];}
			*/
		}
		return result;
	}

}
