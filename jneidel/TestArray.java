public class TestArray {
  public static void main(String[] args) {
    int[] array = {0,1,2,3,4,5,6,7,8,9};
    ArrayMethoden methods = new ArrayMethoden( array );

    methods.printContents();
    System.out.println();

    System.out.printf( "7th : %d%n", methods.arrayGet( 7 ) );
    System.out.printf( "10th: %d%n%n", methods.arrayGet( 10 ) );

    System.out.printf( "Mittelwert: %.2f%n%n", methods.mittelwert() );

    System.out.printf( "Quadriert%n" );
    methods.quadrat();
    methods.printContents();
    System.out.println();

    System.out.printf( "max: %d%n", methods.max() );
    System.out.printf( "2nd to max: %d%n", methods.zweitGroestes() );
    System.out.printf( "min: %d%n%n", methods.min() );

    System.out.printf( "count of round numbers: %d%n", methods.roundNumbersCount() );
  }
}
