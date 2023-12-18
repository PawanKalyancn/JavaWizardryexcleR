package encapulationandaggeration;

public class Address {
	private String addressLine;
    private String city;
 
    // Parameterized constructor
	public Address(String addressLine, String city) {
		super();
		this.addressLine = addressLine;
		this.city = city;
	}
	
	// Getters and Setters for addressLine and city
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	// Method to get the address details

	@Override
	public String toString() {
		return "Address [addressLine=" + addressLine + ", city=" + city + ", getAddressLine()=" + getAddressLine()
				+ ", getCity()=" + getCity() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public String getAddressDetails() {
		// TODO Auto-generated method stub
        return addressLine + ", " + city;


}
}
