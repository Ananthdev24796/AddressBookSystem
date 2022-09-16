/**
 * 
 */
package com.bridgelabz;

/**
 * @author Iam_A
 *
 */
public class Contacts {

	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zipCode;
	private long phoneNumber;
	private String email;
	
	public Contacts(String firstName, String lastName, String address, String city, String state, int zipCode,
			long phoneNumber, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.firstName+ " "+this.lastName+" "+this.address+" "+this.city+" "+this.state+" "+this.email+" "+this.zipCode+" "+this.phoneNumber;
	}
	
	 
}
