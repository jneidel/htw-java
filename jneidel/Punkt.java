public class Punkt {
  private int x, y;
  private String color;

  public Punkt( int x, int y, String color) {
    this.x = x;
    this.y = y;
    this.color = color;;
  }
  public Punkt() {
    x = 0;
    y = 0;
  }

  public void setX ( int i ) { x = i; }
  public void setY ( int i ) { y = i; }
  public void setXY ( int x, int y ) { this.x = x; this.y = y; }
  public void setColor ( String s ) { color = s; }

  public int getX () { return x; }
  public int getY () { return y; }
  public String getColor () { return color; }


  public String formatPrint() {
    return "x=" + x + "; y=" + y + "; color=" + color;
  }
  public void print() {
    System.out.printf( "%s%n", this.formatPrint() );
  }

  public void shiftByOne() {
    x ++;
    y ++;
  }

  public void shift( int deltaX, int deltaY ) {
    x += deltaX;
    y += deltaY;
    
    this.print();
  }

  public double calcDistance( Punkt p ) {
    return Math.sqrt( Math.pow( this.x - p.getX(), 2 ) + Math.pow( this.y - p.getY(), 2 ) );
  }
  public void printDistance( Punkt p ) {
    System.out.printf( "Distance between\n point a (%s)\nand\n point b (%s)\nis %.2f%n", this.formatPrint(), p.formatPrint(), this.calcDistance( p ) );
  }
}
