import java.util.Scanner;


public class Customer {
	public static void main (String [] args) {
		
	Scanner input = new Scanner(System.in);	
	
	System.out.println("Please Select Transaction Type: Withdrawal or Deposit");
	String userSelection = input.next(); 
	System.out.println("You selected: " + userSelection);
	
	System.out.println("Please enter a " +userSelection+ " decimal value");
	
	Double userSelectionInput = input.nextDouble(); 
	
	Double originalBalance = 50000.0;
	
	if (userSelection.equals("Withdrawal")) {

	System.out.println("Your new balance is $" + (originalBalance-userSelectionInput));
	}
	
	if (userSelection.equals("Deposit")) {
	System.out.println("Your new balance is $" + (originalBalance+userSelectionInput));
	}
	
	input.close(); 
	

	}

}
