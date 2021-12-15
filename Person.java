//package name 
package bankingsystem1;
//class person that models accountHolders
public class Person {
	//instance variables declaration
	private  String firstName;
	private String lastName;
	private String email;
	private long phoneNumber;
	
	//no-arg constructor
	public Person() {
		this("null","null","null",0);
	}
	//parametrized constructor
	public Person (String firstName, String lastName, String email, long phoneNumber) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.email= email;
		this.phoneNumber=phoneNumber;
	}
	
	
	//setter method  for firstName
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	//setter method for lastName
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	//setter method for email
	public void setEmail(String email) {
		this.email=email;
	}
	//setter method for phoneNumber
	public void setPhoneNumber (long phoneNumber) {
		this.phoneNumber=phoneNumber;
	}
	//getter method for name that return fist and last name
	public String getName() {
		return firstName+" "+ lastName;
	}
	//getter method for mail
	public String getEmail () {
		return email;
	}
	//getter method for phoneNumber
	public long getPhoneNumber() {
		return phoneNumber;
	}
	
}
