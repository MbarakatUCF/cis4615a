/******************************************************************************
*R04_STR03_J
*Rule 04. Characters and Strings (STR)
*STR03-J. Do not encode noncharacter data as a stringrange of unsigned data
*  Compilation:  javac R04_STR03_J.java 
*  Execution:    java R04_STR03_J
* producing a String representation of the BigInteger object and then converting the String object to a byte array.
* ******************************************************************************/
import java.math.BigInteger;

public class R04_STR03_J {
public static void main(String args[]) {

BigInteger x = new BigInteger("530500452766");
String s = x.toString(); //Valid character data
byte[] byteArray = s.getBytes();
String ns = new String(byteArray);
x = new BigInteger(ns);
System.out.println("x = " + x);
}
}
