package atmoperations;

public class Transaction {
	private String type;//PRIVATE IS KEYWORD WICH IS ACESS MODIFER
    private double amount;
	public Transaction(String type, double amount) {
		super();
		this.type = type;
		this.amount = amount;
	}  
	
	
	public Transaction() {
		super();
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Transaction [type=" + type + ", amount=" + amount + "]";
	}

}
