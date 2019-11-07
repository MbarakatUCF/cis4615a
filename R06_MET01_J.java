/******************************************************************************
* R06_MET01_J
* Rule 06. Methods (MET)
* MET01-J. Never use assertions to validate method arguments
*  Compilation:  javac R06_MET01_J.java 
*  Execution:    java R06_MET01_J 
*  Calls function getAbsAdd(x,y) with valid and invalid values
* ******************************************************************************/

public class R06_MET01_J {
public static void main(String args[]) {

//testing with valid values
int a = -12;
int b = -30;
int c = getAbsAdd(a,b);
System.out.println("a = " + a + " and b = " + b);
System.out.println("Absolute add = " + c);

//testing with invalid value
a = Integer.MAX_VALUE;
b = -30;
c = getAbsAdd(a,b);
System.out.println("a = " + a + " and b = " + b);
System.out.println("Absolute add = " + c);

}

public static int getAbsAdd(int x, int y) {
	assert x != Integer.MIN_VALUE;
	assert y != Integer.MIN_VALUE;
	int absX = Math.abs(x);
	int absY = Math.abs(y);
	assert (absX <= Integer.MAX_VALUE - absY);
	return absX + absY;
}
}