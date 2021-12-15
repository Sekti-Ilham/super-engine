//package name 
package bankingsystem1;

public class Chequing extends Account {
	
	//specific instance variable for chequing account
	private double fees;
	
	
		//no-args constructor 
	public Chequing() {
			super();
			fees=13.50;
		}
		
		//parameterized constructor
	public Chequing (long accNumber,String firstName, String lastName, String email, long phoneNumber, double balance, double fees) {
		super(accNumber,firstName, lastName, email, phoneNumber,  balance);
		this.fees=fees;
			
	}
	
	
    //updateBalance method that applies a 13.50 dollars fee on every chequing accounts
	@Override
	public void updateBalance() {
		super.updateBalance();//calling updateBalance of super class 
		
	   double balance = super.getBalance()-fees;//applying fees on balance 
	   super.setBalance(balance);//setting new value of balance
		
	}
		
	
}
