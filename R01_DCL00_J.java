/******************************************************************************
*R01_DCL00_J
*Rule 01. Declarations and Initialization (DCL)
*DCL00-J. Prevent class initialization cycles
*  Compilation:  javac R01_DCL00_J.java 
*  Execution:    java R01_DCL00_J 
*  Checking balance using static final class variable with correct initalization
* ******************************************************************************/


public class R01_DCL00_J {

	public static void main(String[] args){
        Cycle.checking(args);
    }

	public static class Cycle {
  		private final int balance;
  		private static final int deposit = (int) (Math.random() * 100); // Random deposit
 		private static final Cycle c = new Cycle();  // Inserted after initialization of required fields
  
  		public Cycle() {
    	balance = deposit - 10; // Subtract processing fee
 		}
 
 		public static void checking(String[] args) {
   		System.out.println("The account balance is: " + c.balance);
  		}
  
	}
  
}

