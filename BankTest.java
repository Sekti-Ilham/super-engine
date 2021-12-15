/*Student Name :Ilham Sekti
 * Section:
 * Professor:
 * Description:a java program that create a basic banking system, the projects comprises 6 classes namely Person, Account, 
 * Chequing, Savings, and Bank, along with the BankTest class (Driver class)the User is prompted through a menu to type 
 * the name of the bank and the number of account holders, then chooses through a second menu the operation to perform 
 * user can create accounts(chequing or saving), apply fee or interests on account balances, display acconts on console
 */
package bankingsystem1;
import java.util.Scanner;
public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//variables declaration
		Scanner scan =new Scanner (System.in);
		String name;// name of the bank
		int size;//number of accounts or account holders
		int option;//menu options 1 through 4 
		boolean shouldContinue = true;// boolean variable to control looping the menu for user
		boolean isGoodInput=false;// boolean variable to check for good input (input mismatch exception)
		
		
		System.out.print("Enter the name of the Bank: ");
	// outer do while loop to manage the input mismatch exception
	do {
		//code is put inside try catch statement or exception handling
	 try {
		
		name =scan.nextLine();
		System.out.print("How many account holders do you have: ");
		size=scan.nextInt();
		//scan.nextLine();
		// name and number of account holders are used to initialize object of type Bank
		Bank b1=new Bank(name,size);
		
	    // Inner loop that manages the menu for user
		while (shouldContinue){
		
		  System.out.print("1. Read Accounts  \n2. Run monthly process \n3. Display Accounts  \n4. Exit  \n Enter your option: ");
		  option=scan.nextInt();
		  //switch statement to manage user's choices
		  switch(option) {
		  	 case 1:
		  		 b1.readAccount(scan);
		  		 break;
		  	 case 2:
		  		 b1.runMonthlyProcess();
		  		 break;
		  	 case 3:
		  		 b1.printTitle();
		  		 b1.displayAccount();
		  		 break;
		  	 case 4:
		  		 System.out.println("Goodbye...Have a nice day!");
		  		 shouldContinue =false;
		  		 break;
		  	 default :
		  		 System.out.println("Invalid option. Try again");//program will continue prompting user for valid input if not valid 
		  		 
		  }
		
		 }
		isGoodInput=true;//isGoodInput is set to true when all input is valid 
	}
	 catch(Exception e) {
			 System.out.println("Invalid option.. Please try again.");
			 // if input is not valid program will bring user back to number of accouns holders
	
     }
	}while(isGoodInput==false);
  }
}