/******************************************************************************
*R49_MSC02_J
*Rule 49. Miscellaneous (MSC)
*MSC02-J. Generate strong random number
*  Compilation:  javac R49_MSC02_J.java
*  Execution:    java R49_MSC02_J
*  Produces an identical sequence of numbers for each given seed value Using the insecure java.util.Random
* ******************************************************************************/
import java.util.Random;
import java.util.*;

public class R49_MSC02_J {
public static void main(String args[]) { 
Random number = new Random(123L);

for (int i = 0; i < 20; i++) {
  // Generate another random integer in the range [0, 20]
  int n = number.nextInt(21);
  System.out.println(n);
}
}
}