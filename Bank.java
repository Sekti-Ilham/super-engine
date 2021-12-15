//Package name
package bankingsystem1;

//Import statement of class Scanner 
import java.util.Scanner;

//Bank class that manipulates the bank accounts
public class Bank {

	//Instance variables declaration
	private static String name;// name of the bank
	private static int numAccounts;// number of bank accounts
	private static Account []accounts;// array that will hold account objects( saving and chequing)
	
	//no-args constructor
	public Bank() {}
	
	//parametrized constructor
	public Bank (String name, int size) {
		this.name=name;
		accounts=new Account[size];
	}
	
	//read account method will read and create a saving or chequing account based on user choice, accounts will be stored in an array 
	//of type Account 
	public void readAccount(Scanner scan) {
		int accountType;// type of account whether 1 for saving or 2 for chequing
		
	
	 //first check if number of accounts stored in the array accounts is less than the array length
		if (numAccounts<accounts.length){
		System.out.println("1. Chequing");// prompting user to type a choice  1 for chequing
		System.out.println("2. Savings");// 2 for savings
		System.out.print("Enter the type of account you want to create: ");
		accountType=scan.nextInt();
		scan.nextLine();
		 // if choices are different form 1 and 2 program will continue prompting user for a valid option 1 or 2 
			while (accountType!=1 && accountType!=2) {
		 	System.out.println("Invalid type...Please try again!" );
		    System.out.println("1. Chequing");
			System.out.println("2. Savings");
			System.out.print("Enter the type of account you want to create: ");
			accountType=scan.nextInt();
			scan.nextLine();
	       }
			//create chequing accounts object when user types 1 and store it in array acconts
			if (accountType ==1) {
			Account chq=new Chequing();
			for (int i =numAccounts;i<accounts.length;i++) {
			accounts[i]=chq;
			}
			//if user chooses 2, an object of class saving is created and stored in array accounts
			}else if (accountType==2) { 
					Account sav=new Savings();
					for (int j =numAccounts; j<accounts.length;j++) {
					accounts[j]=sav;
					}
			}			
			// reading accounts details for the object created and stored in the array accounts
			accounts[numAccounts].readAccountDetails(scan);
			numAccounts++;

	    // if number of accounts stored is equal to array length then user will be informed 
		}else {System.out.println("****Maximum reached....Cannot add more accounts****");
		}
	}
	
    //runMonthlyProcess method that applies feex on chequing accounts and interests on saving accounts
	public void runMonthlyProcess() {
		
		boolean isEmpty=true;//check that array of accounts is not empty before running process
		
		for (int i =0;i<accounts.length;i++) {
			if (accounts[i]==null) {
				isEmpty=true;
			} else isEmpty=false;
		}
		
		     // inform user that no process can be run on empty array
			if (isEmpty==true) {
				System.out.println("****No accounts to process****");
				//run monthly process and update accounts when array is not empty
			}else for (int i =0;i<accounts.length;i++) {
				accounts[i].updateBalance();
			}	
    }
	
	
	//displayAccounts method that prints accounts detais to the console
	public void displayAccount() {
		//check that array of accounts is not empty
		boolean isEmpty=true;
		
		for (int i =0;i<accounts.length;i++) {
			if (accounts[i]==null) {
				isEmpty=true;
			} else isEmpty=false;
		}
		     // if array is empty inform user, if not program prints account details on the console
			if (isEmpty==true) {
				System.out.println("****No accounts to display****");
			}else  for (int i =0;i<numAccounts;i++) {
				accounts[i].displayAccount();
		}
	}
	
	//printStar method that manages output presentation
	public static void printStar() {
		for(int i =0; i<83;i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	//method that prints tile of input
	public static void printTitle() {
		boolean isEmpty=true;
		//check that array is not empty before inputting title
		for (int i =0;i<numAccounts;i++) {
			if (accounts[i]==null) {
				isEmpty=true;
			} else isEmpty=false;
		}
		
				
			//if array is not empty then method print title and stars accordingly
		if (isEmpty== false) {     
				printStar();
				System.out.printf("%37s%-38s%n",name," Bank");
				printStar();
				System.out.printf("%12s%19s%19s%17s%12s%n", "Acc Number  |","Name  |","Email  |","   Phone Number  |","Balance");
				printStar();


			}
		}
	
		
	
			

}

