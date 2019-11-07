/******************************************************************************
*R49_MSC02_J
*Rule 49. Miscellaneous (MSC)
*MSC02-J. Generate strong random number
*  Compilation:  javac R49_MSC02_J.java
*  Execution:    java R49_MSC02_J
* Uses the SecureRandom.getInstanceStrong() method, introduced in Java 8, to use a strong RNG algorithm
* ******************************************************************************/
import java.security.SecureRandom;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class R49_MSC02_J {
public static void main (String args[]) {
   try {
     SecureRandom number = SecureRandom.getInstanceStrong();
     // Generate 20 integers 0..20
     for (int i = 0; i < 20; i++) {
       System.out.println(number.nextInt(21));
     }
   } catch (NoSuchAlgorithmException nsae) {
     // Forward to handler
   }
}
}
