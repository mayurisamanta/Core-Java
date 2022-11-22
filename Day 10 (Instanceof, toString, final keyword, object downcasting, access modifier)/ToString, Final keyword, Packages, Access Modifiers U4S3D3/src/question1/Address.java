package question1;

public class Address {

	String city;
	
	String state;
	
	String pincode;

	public Address(String city, String state, String pincode) {
		super();
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public Address() {
		super();
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	
}
