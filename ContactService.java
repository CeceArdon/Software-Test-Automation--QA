package contactservice;

import java.util.ArrayList;

public class ContactService {
	// Contains a list of contacts

	private ArrayList<Contact> contacts;

	public ContactService() {
		contacts = new ArrayList<>();
	}

	// The contact service shall be able to add contacts with a unique ID
	public boolean addContact(Contact newContact) {
		boolean contains = false;
		for (Contact c : contacts) {
			if (c.getID().equalsIgnoreCase(newContact.getID())) {
				contains = true;
				break;
			}
		}

		if (!contains) {
			contacts.add(newContact);
			return true;
		} else {
			return false;
		}
	}

	// The contact service shall be able to delete contacts per contact ID.
	public boolean deleteContact(String contactID) {
		boolean deleted = false;
		for (Contact c : contacts) {
			if (c.getID().equalsIgnoreCase(contactID)) {
				contacts.remove(c);
				deleted = true;
				break;
			}
		}
		return deleted;
	}

	// Updates First name for the given contact ID
	public boolean updateFirstName(String contactID, String newFirstName) {
		boolean updated = false;
		for (Contact c : contacts) {
			if (c.getID().equalsIgnoreCase(contactID)) {
				c.setFirstName(newFirstName);
				updated = true;
				break;
			}
		}
		return updated;
	}

	// Updates Last name for the given contact ID
	public boolean updateLastName(String contactID, String newLastName) {
		boolean updated = false;
		for (Contact c : contacts) {
			if (c.getID().equalsIgnoreCase(contactID)) {
				c.setLastName(newLastName);
				updated = true;
				break;
			}
		}
		return updated;
	}

	// Updates number for the given contact ID
	public boolean updateContactNumber(String contactID, String newNumber) {
		boolean updated = false;
		for (Contact c : contacts) {
			if (c.getID().equalsIgnoreCase(contactID)) {
				c.setPhone(newNumber);
				updated = true;
				break;
			}
		}
		return updated;
	}

	// Update Address for the given contact ID
	public boolean updateContactAddress(String contactID, String newAddress) {
		boolean updated = false;
		for (Contact c : contacts) {
			if (c.getID().equalsIgnoreCase(contactID)) {
				c.setAddress(newAddress);
				updated = true;
				break;
			}
		}
		return updated;
	}
	public boolean updateContact(String contactID, String firstName, String lastName, String phoneNum, String addressNum) {

		for (Contact contactList:contacts) {

		if (contactList.getID().equals(contactID)) {

		if(!firstName.equals("") && !(firstName.length()>10)) {

		contactList.setFirstName(firstName);

		}

		if(!lastName.equals("") && !(lastName.length()>10)) {

		contactList.setFirstName(lastName);

		}

		if(!phoneNum.equals("") && (phoneNum.length()==10)) {

		contactList.setFirstName(phoneNum);

		}

		if(!addressNum.equals("") && !(addressNum.length()>30)) {

		contactList.setFirstName(addressNum);

		}

		return true;

		}

		}

		return false;
	}
	
}
