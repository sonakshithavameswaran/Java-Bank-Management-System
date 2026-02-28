

	import java.util.ArrayList;
	import java.util.Scanner;

	public class BankManagementSystem {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        ArrayList<BankAccount> accounts = new ArrayList<>();

	        int choice;

	        do {
	            System.out.println("\n----- BANK MANAGEMENT SYSTEM -----");
	            System.out.println("1. Create Account");
	            System.out.println("2. Deposit");
	            System.out.println("3. Withdraw");
	            System.out.println("4. Check Balance");
	            System.out.println("5. Display Account Details");
	            System.out.println("6. Exit");
	            System.out.print("Enter your choice: ");

	            choice = sc.nextInt();

	            switch (choice) {

	                case 1:
	                    System.out.print("Enter Name: ");
	                    sc.nextLine(); // consume newline
	                    String name = sc.nextLine();

	                    System.out.print("Enter Account Number: ");
	                    int accNo = sc.nextInt();

	                    System.out.print("Enter Initial Balance: ");
	                    double balance = sc.nextDouble();

	                    BankAccount newAccount = new BankAccount(name, accNo, balance);
	                    accounts.add(newAccount);

	                    System.out.println("Account created successfully!");
	                    break;

	                case 2:
	                    System.out.print("Enter Account Number: ");
	                    int depositAcc = sc.nextInt();

	                    BankAccount depositAccount = findAccount(accounts, depositAcc);

	                    if (depositAccount != null) {
	                        System.out.print("Enter amount to deposit: ");
	                        double amount = sc.nextDouble();
	                        depositAccount.deposit(amount);
	                    } else {
	                        System.out.println("Account not found.");
	                    }
	                    break;

	                case 3:
	                    System.out.print("Enter Account Number: ");
	                    int withdrawAcc = sc.nextInt();

	                    BankAccount withdrawAccount = findAccount(accounts, withdrawAcc);

	                    if (withdrawAccount != null) {
	                        System.out.print("Enter amount to withdraw: ");
	                        double amount = sc.nextDouble();
	                        withdrawAccount.withdraw(amount);
	                    } else {
	                        System.out.println("Account not found.");
	                    }
	                    break;

	                case 4:
	                    System.out.print("Enter Account Number: ");
	                    int checkAcc = sc.nextInt();

	                    BankAccount checkAccount = findAccount(accounts, checkAcc);

	                    if (checkAccount != null) {
	                        checkAccount.checkBalance();
	                    } else {
	                        System.out.println("Account not found.");
	                    }
	                    break;

	                case 5:
	                    System.out.print("Enter Account Number: ");
	                    int displayAcc = sc.nextInt();

	                    BankAccount displayAccount = findAccount(accounts, displayAcc);

	                    if (displayAccount != null) {
	                        displayAccount.displayDetails();
	                    } else {
	                        System.out.println("Account not found.");
	                    }
	                    break;

	                case 6:
	                    System.out.println("Thank you for using Bank Management System!");
	                    break;

	                default:
	                    System.out.println("Invalid choice.");
	            }

	        } while (choice != 6);

	        sc.close();
	    }

	    // Method to find account
	    public static BankAccount findAccount(ArrayList<BankAccount> accounts, int accNo) {

	        for (BankAccount account : accounts) {
	            if (account.getAccountNumber() == accNo) {
	                return account;
	            }
	        }

	        return null;
	    }
	}

