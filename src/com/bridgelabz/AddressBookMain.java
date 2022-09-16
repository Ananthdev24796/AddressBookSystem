/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Iam_A
 *
 */
public class AddressBookMain {

	/**
	 * UC2-Ability to add a new Contact to Address Book
	 *  Use Console to add person details from AddressBookMain class
	 *  Use Object Oriented Concepts to manage relationship between AddressBook and Contact Person
	 */
	
	public static void main(String[] args) {
			System.out.println("enter the contact details");
			 Scanner input = new Scanner(System.in);
			 String firstName =input.nextLine() ;
			 String lastName= input.nextLine();
			 String address=input.nextLine();
			 String city=input.nextLine();
			 String state=input.nextLine();
			 String email=input.nextLine();
			 
			 int zipCode=input.nextInt();
			 long phoneNumber=input.nextLong();
			 
			
			 
			 
			Contacts person1 = new Contacts(firstName,lastName,address,city,state,zipCode,phoneNumber,email);
			AddressBook objAddress = new AddressBook();
			objAddress.addingContactToAddressBook(person1);
			objAddress.display();
			input.close();
	}

	

}
