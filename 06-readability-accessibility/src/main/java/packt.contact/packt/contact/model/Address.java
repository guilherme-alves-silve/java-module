package packt.contact.model;

public class Address {

	private String street;
	private String city;
	private String state;
	private String country;
	
	public String getStreet() {
		return street;
	}

	public Address setStreet(String street) {
		this.street = street;
        return this;
	}

	public String getCity() {
		return city;
	}

	public Address setCity(String city) {
		this.city = city;
        return this;
	}

	public String getState() {
		return state;
	}

	public Address setState(String state) {
		this.state = state;
        return this;
	}

	public String getCountry() {
		return country;
	}

	public Address setCountry(String country) {
		this.country = country;
        return this;
	}

    public String toString() { 
        return this.street + " " + this.city + " " + this.state + " " + this.country; 
    }
}