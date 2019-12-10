public class FloatQueue {
  float[] q;

  FloatQueue(int length) {
    q = new float[length];
  }

  public void queuePrint() {
    if ( isEmpty() ) {
      System.out.println( "Queue ist leer\n" );
    } else {
      System.out.print( "Inhalt: " );
      for (int i = 0; i < q.length; i++) {
        if (q[i] != 0 ) {
          System.out.printf( "%.2f ", q[i] );
        }
      }
      System.out.println( "\n" );
    }
  }

  public void enqueue(float f) {
    // insert f at first non-zero value
    for ( int i = 0; i < q.length; i++ ) {
      if (q[i] == 0) {
        q[i] = f;
        break;
      }
    }
  }

  public float dequeue() {
    float returnVal = q[0];
    if ( returnVal == 0 ) {
      returnVal = -1;
    }

    // Move whole array forward by one
    for ( int i = 1; i < q.length; i++ ) {
      q[i-1] = q[i];
    }
    q[q.length-1] = 0;

    return returnVal;
  }

  public boolean isEmpty() {
    return q[0] == 0;
  }

  public void clear() {
    q = new float[q.length];
  }
}
