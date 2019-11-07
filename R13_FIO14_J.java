/******************************************************************************
*R13_FIO14_J
*Rule 13. Input Output (FIO)
*FIO14-J. Perform proper cleanup at program termination
*  Compilation:  javacR13_FIO14_J.java 
*  Execution:    java R13_FIO14_J
* This program closes open files when it exits. The file is closed without the text actually being written.
* ******************************************************************************/
import java.io.*;
import java.io.PrintStream;
 import java.io.BufferedOutputStream;
 import java.io.IOException;

public class R13_FIO14_J {

  public  static void main(String[] args) throws FileNotFoundException {
    final PrintStream out =
     new PrintStream(new BufferedOutputStream(new FileOutputStream("foo.txt")));
    out.println("hello");
    Runtime.getRuntime().exit(1);
  }
}

