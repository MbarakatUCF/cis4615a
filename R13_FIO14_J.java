/******************************************************************************
*R13_FIO14_J
*Rule 13. Input Output (FIO)
*FIO14-J. Perform proper cleanup at program termination
*  Compilation:  javacR13_FIO14_J.java 
*  Execution:    java R13_FIO14_J
* Adds a shutdown hook to close the file. This hook is invoked by Runtime.exit() and is called before the JVM is halted.
* ******************************************************************************/
import java.io.*;
import java.io.PrintStream;
 import java.io.BufferedOutputStream;
 import java.io.IOException;


public class R13_FIO14_J {

  public static void main(String[] args)
    throws FileNotFoundException {
    final PrintStream out = 
      new PrintStream(new BufferedOutputStream(new FileOutputStream("foo.txt")));
    Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() 
      {   public void run() {
          out.close();
      }
    }));
    out.println("hello");
    Runtime.getRuntime().exit(1);
  }
}
