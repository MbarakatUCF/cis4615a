/******************************************************************************
*R05_OBJ03_J
*Rule 05. Object Orientation (OBJ)
*OBJ03-J. Prevent heap pollution
*  Compilation:  javac R05_OBJ03_J.java 
*  Execution:    java R05_OBJ03_J
*  Program that compiles but results in heap pollution. parameterized type information is discarded before execution.
* ******************************************************************************/
import java.util.ArrayList;
import java.util.List;

public class R05_OBJ03_J {

  public static void main(String[] args) {
    List<String> list = new ArrayList<String> ();
    addToList(list, 42);
    System.out.println(list.get(0));  // Throws ClassCastException
  }

  private static void addToList(List list, Object obj) {
    list.add(obj); // Unchecked warning
  }
}
