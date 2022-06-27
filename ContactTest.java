package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import contactservice.Contact;

class ContactTest {
	Contact contact = new Contact("ID01", "firstName", "lastName", "3423427676", "Weber 8th Ave NE"); // making the object as a class member so that all the methods can access it

    @Test
    void getID() {
        assertEquals("ID01", contact.getID());
    }

    @Test
    void getFirstName() {
        assertEquals("firstName", contact.getFirstName());
    }

    @Test
    void getLastName() {
        assertEquals("lastName", contact.getLastName());
    }

    @Test
    void getPhone() {
        assertEquals("3423427676", contact.getPhone());
    }

    @Test
    void getAddress() {
        assertEquals("Weber 8th Ave NE", contact.getAddress());
    }

    @Test
    void testToString() {
        assertEquals("Contact [contactID=ID01, firstName=firstName, lastName=lastName, phoneNumber=3423427676, address=Weber 8th Ave NE]", contact.toString());
    }
}
