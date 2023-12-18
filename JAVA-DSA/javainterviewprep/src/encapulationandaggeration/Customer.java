package encapulationandaggeration;

public class Customer {
	private String customerName;
    private Address residentialAddress;
    
 // Parameterized constructor
	public Customer(String customerName, Address residentialAddress) {
		super();
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
	}
	// Default constructor
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Address getResidentialAddress() {
		return residentialAddress;
	}
	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}

	// Method to get the customer details

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", residentialAddress=" + residentialAddress + "]";
	}
	public String getCustomerDetails() {
		// TODO Auto-generated method stub
        return "Customer: " + customerName + "\nResidential Address: " + residentialAddress.getAddressDetails();
	}

}
