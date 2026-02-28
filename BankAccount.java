
public class BankAccount {
	

	    private String name;
	    private int accountNumber;
	    private double balance;

	    // Constructor
	    public BankAccount(String name, int accountNumber, double balance) {
	        this.name = name;
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	    }

	    public int getAccountNumber() {
	        return accountNumber;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Amount deposited successfully.");
	        } else {
	            System.out.println("Invalid amount.");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount <= balance && amount > 0) {
	            balance -= amount;
	            System.out.println("Withdrawal successful.");
	        } else {
	            System.out.println("Insufficient balance or invalid amount.");
	        }
	    }

	    public void checkBalance() {
	        System.out.println("Current Balance: " + balance);
	    }

	    public void displayDetails() {
	        System.out.println("Account Holder Name: " + name);
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Balance: " + balance);
	    }
	}


