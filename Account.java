
//Package name
 package bankingsystem1;
 
//Import scanner but object is created only in driver class
import java.util.Scanner;

/*Account class  that models a banking accounts, it is a super class, it provides instances variables an methods 
*to its sub classes savings and chequing classes
*/
public class Account {
	private long accNumber;//
	private Person accHolder;//
	private double balance;//
	
	//No-args constructor 
	public Account () {
		accHolder=new Person();//composition: class Accounts hold an object of type person
	}
	
	//parametrized constructor
	public Account(long accNumber,String firstName, String lastName, String email, long phoneNumber, double balance) {
		this.accNumber=accNumber;
		this.accHolder= new Person(firstName, lastName,  email, phoneNumber);
		this.balance=balance;
	}
    
	//getter method for balance as it will be accessed from subclasses for update calculations
	public double getBalance() {
		return balance;
	}
	//setter methods for balance as it will be accessed from subclasses for update calculations
	public void setBalance(double balance) {
		this.balance=balance;
	}
	
	/*
	 * worker method that accepts Scanner object and reads accNumber, 
	*all personal details, and balance. With the personal details, invoke the Person’s constructor 
	*to create the accHolder object.
	*/
	public void readAccountDetails(Scanner scan) {
		
			 //prompting user to enter an account number
			System.out.print("Enter Account Number:");
			while (!scan.hasNextLong()) {
				System.out.println("this is not a number ,enter a valid number");
				scan.nextLine();
			  }
			this.accNumber =scan.nextLong();
			scan.nextLine();//clearing input stream
			
			//prompting user for first name 
			System.out.print("Enter first name: ");
			while (!scan.hasNextLine()) {
				System.out.println("this is not a valid name");
				scan.nextLine();
			  }
			String fname=scan.nextLine();
			//prompting user for last name 
			System.out.print("Enter last name: ");
			while (!scan.hasNextLine()) {
				System.out.println("this is not a valid name");
				scan.nextLine();
			  }
			String lname=scan.nextLine();
			//prompting user for email address
			
			System.out.print("Enter email: ");
			String email=scan.nextLine();
			//prompting user for phone number 
			System.out.print("Enter phone number: ");
			while (!scan.hasNextLong()) {
				System.out.println("this is not a number ,enter a valid number");
				scan.nextLine();
			  }
			long phone=scan.nextLong();
			scan.nextLine();//clear input stream
			
			//instantiation of a person object with personal info that are stored in accHolder
			accHolder=new Person(fname,lname,email,phone);
			//prompting user for balance
			System.out.print("Enter balance: ");
			while (!scan.hasNextDouble()) {
				System.out.println("this is not a number ,enter a valid number");
				scan.nextLine();
			  }
			this.balance=scan.nextDouble();
			scan.nextLine();//clear input stream
			
			
		}
	
	//displayAccount method that prints to the console details of account
	public void displayAccount() {
		
		System.out.printf("%10d  |%16s  |%16s  |   %12d  |%12.2f%n", accNumber,accHolder.getName(),accHolder.getEmail(), accHolder.getPhoneNumber(), this.balance);
	}
	
	//updateBalance method that prints number of account being updated
	public void updateBalance() {
		System.out.println("Updating balance of "+this.accNumber);
		
	}

	
	
}
