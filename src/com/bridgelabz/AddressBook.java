/**
 * 
 */
package com.bridgelabz;

import java.util.ArrayList;

/**
 * @author Iam_A
 *
 */
public class AddressBook {
		// Here we will be storing all the object of contact class 
	
		ArrayList addressBookListToStoreNContacts = new ArrayList();
		
		public void addingContactToAddressBook(Contacts contactsPerson) {
			addressBookListToStoreNContacts.add(contactsPerson);
		}
			public void display() {
				System.out.println(addressBookListToStoreNContacts);
			}
}


