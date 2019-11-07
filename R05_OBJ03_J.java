/******************************************************************************
*R05_OBJ03_J
*Rule 05. Object Orientation (OBJ)
*OBJ03-J. Prevent heap pollution
*  Compilation:  javac R05_OBJ03_J.java 
*  Execution:    java R05_OBJ03_J
* Prevents insertion of an object to the parameterized list. Enforces type safety by changing the addToList() method signature to enforce proper type checking.
* ******************************************************************************/
import java.util.ArrayList;
import java.util.List;

public class R05_OBJ03_J {

  public static void main(String[] args) {
    List<String> list = new ArrayList<String> ();
    addToList(list, "42");
    System.out.println(list.get(0));
  }

  private static void addToList(List<String> list, String str) {
    list.add(str);     // No warning generated
  }
}
