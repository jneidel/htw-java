import java.util.Arrays;

public class ArrayMethoden {
  int[] a;
  ArrayMethoden(int[] array) {
    this.a = array;
  }

  public void printContents() {
    System.out.print( "Inhalt: " );

    for( int i = 0; i < a.length; i++ ) {
      System.out.printf( "%d ", a[i] );
    }

    System.out.println();
  }

  public int arrayGet(int i) {
    i -= 1;
    if ( i >= a.length | i < 0 ) {
      return Integer.MIN_VALUE; 
    } else {
      return a[i];
    }
  }

  public float mittelwert() {
    int total = 0;

    for( int i = 0; i < a.length; i++ ) {
      total += a[i];
    }

    return (float) total/a.length;
  }

  public void quadrat() {
    for( int i = 0; i < a.length; i++ ) {
      a[i] = (int) Math.pow( (double) a[i], 2 );
    }
  }

  public int max() {
    return Arrays.stream(a).max().getAsInt();
  }
  public int min() {
    return Arrays.stream(a).min().getAsInt();
  }

  public int zweitGroestes() {
    int largest = 0;
    int secondLargest = 0;

    for( int i = 0; i < a.length; i++ ) {
      int v = a[i];

      if ( v >= largest ) {
        secondLargest = largest;
        largest = v;
      } else if ( v > secondLargest ) {
        secondLargest = v;
      }
    }

    return secondLargest;
  }

  public int roundNumbersCount() {
    int count = 0;

    for( int i = 0; i < a.length; i++ ) {
      if ( (a[i] % 2) == 0 ) {
        count ++;
      }
    }

    return count;
  }
}
