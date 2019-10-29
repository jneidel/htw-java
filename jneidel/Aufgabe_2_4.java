import java.util.Scanner; 

public class Aufgabe_2_4 {
  public static void main( String[] args ) {
    int secret = (int) (49 * Math.random() + 1); 
    Scanner scan = new Scanner(System.in);

    System.out.println( "I got a random number between 1 and 49. Guess it." );

    int count = 1;
    while ( true ) {
      System.out.print( count + ". try: " );
      int i = scan.nextInt();

      if ( i == secret ) {
        System.out.println( "Found the secret number on the " + count + ". try." );
        break;
      } else if ( i < secret ) {
        System.out.println( "The secret is bigger." ); 
      } else if ( i > secret ) {
        System.out.println( "The secret is smaller." ); 
      }

      count++;
    }
  }
}
