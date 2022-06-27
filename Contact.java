package contactservice;

public class Contact {
	private String contactID;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String addressNum;
	
	public Contact(String contactID, String firstName, String lastName, String phoneNum, String addressNum) {
		if(contactID == null || contactID.length()>10) {
			throw new IllegalArgumentException("Invalid id");
		}
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid firstName");
		}
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid lastName");
		}
		if(phoneNum == null || phoneNum.length()>10) {
			throw new IllegalArgumentException("Invalid phone");
		}
		if(addressNum == null || addressNum.length()>30) {
			throw new IllegalArgumentException("Invalid address");
		}
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
		this.addressNum = addressNum;	
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setPhone(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public void setAddress(String addressNum) {
		this.addressNum = addressNum;
	}
	
	public String getID() {
		return contactID; 
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhone() {
		return phoneNum;
	}
	public String getAddress() {
		return addressNum;
	}
	@Override

	public String toString() {

	return "Contact [contactID=" + contactID + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNum + ", address=" + addressNum + "]";

	}
}
