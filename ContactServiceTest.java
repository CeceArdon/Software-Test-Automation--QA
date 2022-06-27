package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import contactservice.Contact;
import contactservice.ContactService;


public class ContactServiceTest {
	// Test the add methods.

	@Test

	public void testAdd(){

	ContactService cs = new ContactService();

	Contact c1 = new Contact("ID01", "Jasmine", "Smith", "2056789485", "Rider 34 Drive");

	assertEquals(true, cs.addContact(c1));

	}

	// Test the delete methods.

	@Test

	public void testDelete(){

	ContactService cs = new ContactService();

	Contact c1 = new Contact("ID01", "Jasmine", "Smith", "2056789485", "Rider 34 Drive");

	Contact c2 = new Contact("ID02", "Elvis", "Smith", "2056785555", "Rider 34 Drive");

	Contact c3 = new Contact("ID03", "Mike", "Smith", "3346784444", "Rider 34 Drive");

	cs.addContact(c1);

	cs.addContact(c2);

	cs.addContact(c3);

	assertEquals(true, cs.deleteContact("ID02"));

	assertEquals(false, cs.deleteContact("ID00"));

	assertEquals(false, cs.deleteContact("ID02"));

	}

	// Test the update methods.

	@Test

	public void testUpdate(){

	ContactService cs = new ContactService();

	Contact c1 = new Contact("ID01", "Jasmine", "Smith", "2056789485", "Rider 34 Drive");

	Contact c2 = new Contact("ID02", "Elvis", "Smith", "2056785555", "Rider 34 Drive");

	Contact c3 = new Contact("ID03", "Mike", "Smith", "3346784444", "Rider 34 Drive");

	cs.addContact(c1);

	cs.addContact(c2);

	cs.addContact(c3);
	
	assertEquals(true, cs.updateContact("ID03", "MikeFirst", "SmithLast", "3346784444", "Rider 34 Drive"));

	assertEquals(false, cs.updateContact("ID04", "MikeFirst", "SmithLast", "3346784444", "Rider 34 Drive"));

	}
}
