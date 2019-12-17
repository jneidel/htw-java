public class TestMatrix {
  public static void main(String[] args) {
    double[][] quadratisch = { { 1, 2, 3.0 }, { 4, 5, 6 }, { 7, 8, 9 }, };
    double[][] rechteckig = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
    double[][] gezackt = { { 1, 2 }, { 3, 4 }, { 5, 6, 7, 8 } };
    double[][] offeneMatrix = { null };
    double[][] nullMatrix = null;

    double [][][] matrizen = { quadratisch, rechteckig, gezackt, offeneMatrix, nullMatrix };

    for ( double[][] matrix : matrizen ) {
      try {
        Matrix m = new Matrix( matrix );
        System.out.printf( "Spur der Matrix: %.2f%n%n", m.spur() );
      } catch( NonSquareArrayException e ) {
        System.out.println( e.getMessage() );
      } catch( NonMatrixException e ) {
        System.out.println( e.getMessage() );
      }
    }
  }
}
