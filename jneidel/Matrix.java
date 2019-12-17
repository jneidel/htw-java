public class Matrix {
  double[][] matrix;

  Matrix( double[][] arg ) throws NonSquareArrayException, NonMatrixException {
    if ( arg == null || arg[0] == null ) {
      throw new NonMatrixException();
    }

    for ( int i = 0; i < arg.length; i++ ) {
      for ( int j = 0; j < arg[i].length; j++ ) {
        System.out.printf( "%.2f ", arg[i][j] );
      }
      System.out.println();
    }

    int height = arg.length;
    for ( double[] arr : arg ) {
      int width = arr.length;
      if ( width != height ) {
        throw new NonSquareArrayException();
      }
    }
    matrix = arg; 
  }

  public double spur() {
    double[][] m = this.matrix;

    double sum = 0;
    for (int i = 0; i < m.length; i++ ) {
      sum += m[i][i];
    }

    return sum;
  }
}
