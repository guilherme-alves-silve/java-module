package packt.addressbook.model; 

public class Contact implements Comparable<Contact> { 

    private String id; 
    private String firstName; 
    private String lastName; 
    private String phoneNumber; 
    private Address address;

    public Contact(
        final String firstName, 
        final String lastName,
        final String phoneNumber
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    } 

    public Contact(
        final String id,
        final String firstName,
        final String lastName,
        final String phoneNumber
    ) { 
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public Contact setId(String id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Contact setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Contact setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Contact setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public Address getAddress() {
		return address;
	}

	public Contact setAddress(Address address) {
		this.address = address;
        return this;
	}

    public String toString() { 
        return this.firstName + " " + this.lastName; 
    }
    
    public int compareTo(Contact other) {  
        Contact otherContact = (Contact)other; 
        return this.lastName.compareTo(otherContact.lastName); 
    } 
}
