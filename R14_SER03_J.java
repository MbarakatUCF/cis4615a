/******************************************************************************
*R14_SER03_J
*Rule 14. Serialization (SER)
*SER03-J. Do not serialize unencrypted sensitive data
*  Compilation:  javac R14_SER03_J.java 
*  Execution:    java R14_SER03_J
* The data members of class Point are private. Assuming the coordinates are sensitive,
* their presence in the data stream would expose them to malicious tampering.
* ******************************************************************************/

import java.io.*;
import java.io.Serializable;

public class R14_SER03_J {

public static class Point implements Serializable {
  private double x;
  private double y;
 
  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }
 
  public Point() {
    // No-argument constructor
  }
}
 public static void main(String[] args){
        Coordinates.check(args);
    }
public static class Coordinates extends Point {
  public static void check(String[] args) {
    FileOutputStream fout = null;
    try {
      Point p = new Point(5, 2);
      fout = new FileOutputStream("point.ser");
      ObjectOutputStream oout = new ObjectOutputStream(fout);
      oout.writeObject(p);
    } catch (Throwable t) {
      // Forward to handler
    } finally {
      if (fout != null) {
        try {
          fout.close();
        } catch (IOException x) {
          // Handle error
        }
      }
    }
  }
}
}