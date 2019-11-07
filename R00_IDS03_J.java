/******************************************************************************
*R00_IDS03_J
*Rule 00.  Input Validation and Data Sanitization (IDS)
*IDS03-J. Do not log unsanitized user input
*  Compilation:  javac R00_IDS03_J.java 
*  Execution:    java R00_IDS03_J 
*  logging in with valid and invalid usernames without sanitizing.
* ******************************************************************************/
import java.util.logging.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class R00_IDS03_J {
static Logger logger = Logger.getLogger(R00_IDS03_J.class.getName());

public static void main(String args[]) {
boolean loginSuccessful;

//testing for valid username
System.out.print("Input Valid Username: ");
Scanner in = new Scanner(System.in);
String username = in.nextLine();
loginSuccessful = true;

if(loginSuccessful) {
	logger.severe("User login succeeded for : " + username);
}
else {
	logger.severe("User login failed for: " + username);
}


//testing for invalid username
System.out.print("Input invalid Username: ");
in = new Scanner(System.in);
username = in.nextLine();
loginSuccessful = false;

if(loginSuccessful) {
	logger.severe("User login succeeded for : " + username);
}
else {
	logger.severe("User login failed for: " + username);
}
}

}