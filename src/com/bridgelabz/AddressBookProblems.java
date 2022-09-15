/**
 * 
 */
package com.bridgelabz;

/**
 * @author Iam_A
 *
 */
public class AddressBookProblems {

	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zipCode;
	private long phoneNumber;
	private String email;


	 public AddressBookProblems(String firstName,String lastName,String address,String city,String state,int zipCode,long phoneNumber,String email ){
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode= zipCode;
		this.phoneNumber= phoneNumber;
		this.email = email;
		}
	 public  void display() {
		 System.out.println(firstName + "\n"+lastName+ "\n"+address+"\n"+city+"\n"+state+"\n"+zipCode+"\n"+phoneNumber+"\n"+email);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddressBookProblems objAddBook = new AddressBookProblems("Ananth","Nair", "Tnagar", "TN", "MDU", 65006, 1234567, "mail@gmail");
		objAddBook.display();

	}

}
