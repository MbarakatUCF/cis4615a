
/******************************************************************************
*R03_NUM03_J
*Rule 03. Numeric Types and Operations (NUM)
*NUM03-J. Use integer types that can fully represent the possible range of unsigned data
*  Compilation:  javac R03_NUM03_J.java 
*  Execution:    java R03_NUM03_J
*  reading integer data with considering the signedness of the source
* ******************************************************************************/
import java.io.*;

public class R03_NUM03_J {
public static void main(String args[]) throws IOException {
DataInputStream is = new DataInputStream(System.in);
System.out.println("Integer = " + getInteger(is));
}

public static long getInteger(DataInputStream is) throws IOException {
	System.out.println("Input integer data");
	return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
}
}