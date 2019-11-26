public class TestPunkt {
  public static void main(String[] args) {
    
    Punkt p1 = new Punkt();
    p1.setXY( 1, 2 ); p1.setColor( "#ff0000" );

    Punkt p2 = new Punkt();
    p2.setXY( 3, 5 ); p2.setColor( "#00ff00" );

    System.out.println( "Initial state:" );
    p1.print();
    p2.print();

    System.out.println( "\nShift:" );
    p1.shift( 2, 2 );
    p2.shift( 0, 0 );

    System.out.println( "\nUpdate p2:" );
    p2.setXY( 3, 5 ); p2.setColor( "#ff0000" );
    p2.print();

    System.out.println( "\nCreate p3 & p4:" );
    Punkt p3 = new Punkt();
    Punkt p4 = new Punkt( 7, 9, "#ff69b4" );
    p3.print();
    p4.print();

    System.out.println();
    p3.printDistance( p4 );
  }
}
