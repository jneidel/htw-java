public class Aufgabe_2_3 {
  public static void main(String[] args) {
    // for loop
    for (byte i = 0; i < 10; i++) {
      for (byte j = 1; j <= 10; j++) {
        int res = j+(i*10);

        int spaces = 4;
        if ( res < 10 ) {
          spaces = spaces + 2;
        } else if ( res < 100 ) {
          spaces = spaces + 1;
        }
        
        System.out.print( " ".repeat( spaces ) );
        System.out.print( res );
      }
        System.out.println();
    }

    // while loop
    byte i = 0;
    while (i < 10) {
      byte j = 1;
      while (j <= 10) {
        int res = j+(i*10);

        int spaces = 4;
        if ( res < 10 ) {
          spaces = spaces + 2;
        } else if ( res < 100 ) {
          spaces = spaces + 1;
        }
        
        System.out.print( " ".repeat( spaces ) );
        System.out.print( res );
        j++;
      }
      System.out.println();
      i++;
    }

    // do-while loop
    i = 0;
    do {
      byte j = 1;
      do {
        int res = j+(i*10);

        int spaces = 4;
        if ( res < 10 ) {
          spaces = spaces + 2;
        } else if ( res < 100 ) {
          spaces = spaces + 1;
        }
        
        System.out.print( " ".repeat( spaces ) );
        System.out.print( res );
        j++;
      } while (j <= 10);
      System.out.println();
      i++;
    } while(i < 10);
  }
}

