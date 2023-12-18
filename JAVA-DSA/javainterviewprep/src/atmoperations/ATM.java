package atmoperations;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATM {
    private double balance;
    private int numberOf100Notes;
    private ArrayList<Transaction> transactionHistory;
    String name;
	int ACCNO;

    public ATM(String name, int aCCNO) {
		super();
		this.name = name;
		ACCNO = aCCNO;
	}

	public ATM(double initialBalance, int initialNotes) {
        balance = initialBalance;
        numberOf100Notes = initialNotes;
        transactionHistory = new ArrayList<>();
    }

    public   void Accountdetails(String name,int ACCno) 
	{

		System.out.println("Name :"+name);
		System.out.println("Acc no:"+ACCno);
		System.out.println("Balance:"+balance);

		System.out.println("==========");

	}
    public void withdraw(double amount) {
        if (amount % 100 == 0 && amount <= balance && amount <= (numberOf100Notes * 100)) {
            if (amount > 10000) {
                if (verifyOTP()) {
                    balance -= amount;
                    numberOf100Notes -= (int) (amount / 100);
                    transactionHistory.add(new Transaction("Withdraw", amount));
                    System.out.println("balance is "+getBalance());
                } else {
                    System.out.println("OTP verification failed. Withdrawal canceled.");
                }
            } else {
                balance -= amount;
                numberOf100Notes -= (int) (amount / 100);
                transactionHistory.add(new Transaction("Withdraw", amount));
                System.out.println("balance is "+getBalance());

            }
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds/notes.");
        }
    }

    public void deposit(double amount) {
        if (amount <= (200 * 100)) {
            balance += amount;
            numberOf100Notes += (int) (amount / 100);
            transactionHistory.add(new Transaction("Deposit", amount));
            System.out.println(" succefull deposted  balance is "+getBalance());

        } else {
            System.out.println("Deposit amount exceeds the limit (200 notes).");
        }
    }

    public void displayTransactionHistory() {
        System.out.println("Transaction History:");
        for (Transaction trans : transactionHistory) {
            System.out.println(trans);
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getNumberOf100Notes() {
        return numberOf100Notes;
    }

    private boolean verifyOTP() {
        Random random = new Random();
        int generatedOTP = 1000 + random.nextInt(9000); // Generate a random 4-digit OTP
        Scanner scanner = new Scanner(System.in);
        System.out.println(generatedOTP);

        System.out.println("An OTP has been sent to your registered mobile number.");
        System.out.print("Enter the OTP to confirm the withdrawal: ");
        int enteredOTP = scanner.nextInt();
        return enteredOTP == generatedOTP;
    } 	  
     
     

    public static void main(String[] args) {
        ATM atm = new ATM(10000.0, 100);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n ATM Menu: ");
            System.out.println("1. ACC DETAILS");

            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Check Balance");
            System.out.println("5. View Transaction History");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
            	case 1:
            		atm.Accountdetails("PAWAN KAlYAN CN",123);
                    break;

                case 2:
                    System.out.print("Enter the withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.print("Enter the deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 4:
                    System.out.println("Current Balance: INR" + atm.getBalance());
                    System.out.println("Number of 100 notes: " + atm.getNumberOf100Notes());
                    break;
                case 5:
                    atm.displayTransactionHistory();
                    break;
                case 6:
                    System.out.println("Exiting ATM. Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
