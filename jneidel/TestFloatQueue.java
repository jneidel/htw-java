public class TestFloatQueue {
  public static void main(String[] args) {
    FloatQueue queue = new FloatQueue( 10 );

    queue.enqueue( 2.45f );
    queue.enqueue( 1.29f );
    queue.queuePrint();

    queue.enqueue( 4.31f );
    queue.enqueue( 7.85f );
    queue.queuePrint();

    queue.dequeue();
    queue.queuePrint();

    queue.enqueue( 1.11f );
    queue.queuePrint();

    queue.clear();
    queue.queuePrint();

    queue.enqueue( 2.11f );
    queue.enqueue( 3.11f );
    queue.queuePrint();

    queue.clear();
    queue.queuePrint();
  }
}
