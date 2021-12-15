//package name 
package bankingsystem1;

public class Savings extends Account {
	
	
	//specific instance variable for saving accounts
	private double interestRate;
	
	//no args constructor that initializes interestRate that invokes the super class no args constructor
	public Savings() {
		super();
		interestRate=0.0399;
	}
	//parametrized constructor that invokes the account class constructor for initilization of instance variables
	public Savings(long accNumber,String firstName, String lastName, String email, long phoneNumber, double balance, double interestRate) {
	super(accNumber,firstName, lastName, email, phoneNumber,  balance);
		//this.interestRate=interestRate;
	}
	
	@Override
	//updateBalance method that calculates the new balance after adding an interest of 0.0399  
	public void updateBalance() {
		super.updateBalance();//calling updateBalance method of super class 
		double balance=super.getBalance()+((super.getBalance()*interestRate)/12);//adding  monthly interest rate
		super.setBalance(balance);//setting new value for balance 
	}
	
}
