/******************************************************************************
*R04_STR03_J
*Rule 04. Characters and Strings (STR)
*STR03-J. Do not encode noncharacter data as a stringrange of unsigned data
*  Compilation:  javac R04_STR03_J.java 
*  Execution:    java R04_STR03_J
* Attempting to convert a BigInteger value to a String and then restore it to a BigInteger value.
* ******************************************************************************/
import java.math.BigInteger;

public class R04_STR03_J {
public static void main(String args[]) {

BigInteger x = new BigInteger("530500452766");
byte[] byteArray = x.toByteArray();
String s = new String(byteArray);
byteArray = s.getBytes();
x = new BigInteger(byteArray);
System.out.println("x = " + x);
}
}