/******************************************************************************
*R14_SER03_J
*Rule 14. Serialization (SER)
*SER03-J. Do not serialize unencrypted sensitive data
*  Compilation:  javac R14_SER03_J.java 
*  Execution:    java R14_SER03_J
* avoids the possibility of incorrect serialization and protects sensitive data members 
* from accidental serialization by declaring the relevant members as transient 
* so that they are omitted from the list of fields to be serialized by the default serialization mechanism.
* ******************************************************************************/

import java.io.*;
import java.io.Serializable;

public class R14_SER03_J {

public static class Point implements Serializable {
 private transient double x; // Declared transient
 private transient double y; // Declared transient
 
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
      Point p = new Point(5,2);
      fout = new FileOutputStream("point.ser");
      ObjectOutputStream oout = new ObjectOutputStream(fout);
      oout.writeObject(p);
      oout.close();
    } catch (Exception e) {
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
