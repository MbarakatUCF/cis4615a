/******************************************************************************
*R02_XP00_J
*Rule 02. Expressions (EXP)
*XP00-J.  Do not ignore values returned by methods
*  Compilation:  javac R02_XP00_J.java 
*  Execution:    java R02_XP00_J 
*  Creating and deleting file
* ******************************************************************************/
import java.io.File;
import java.io.IOException;


public class R02_XP00_J {

public static void main(String args[]) {
deleteFile();
}

public static void deleteFile() {
	File someFile = new File("hello.txt");
	//Do something with someFile
	System.out.println(someFile + " created file object");
	someFile.delete();
	System.out.println(someFile + " Deleted");
}
}