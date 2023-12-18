package encapulationandaggeration;

public class TestCustomer {

	public static void main(String[] args) {
		 // Create an object of Customer with a default constructor and use setters to assign values
        Customer customer1 = new Customer();
        customer1.setCustomerName("pawan");
        Address address1 = new Address("1st Main", "HSR Layout, Bangalore");
        customer1.setResidentialAddress(address1);

        // Display values using getters
        System.out.println("Customer Name: " + customer1.getCustomerName());
        System.out.println("Residential Address: " + customer1.getResidentialAddress().getAddressDetails());

        // Create an object of Customer using a parameterized constructor
        Address address2 = new Address("2nd Main", "Koramangala, Bangalore");
        Customer customer2 = new Customer("Alice", address2);

        // Display customer details using getCustomerDetails method
        System.out.println("\nCustomer Details:\n" + customer2.getCustomerDetails());
    }
}
