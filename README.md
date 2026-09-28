# Banking Management System

A simple console-based Banking Management System developed using Java. This project demonstrates the practical use of Java and Object-Oriented Programming concepts to perform basic banking operations.

## Project Overview

The Banking Management System is a menu-driven Java application that allows users to manage customer accounts and perform basic banking operations through a console interface.

## Features

The application provides the following menu options:

```text
===== BANKING MANAGEMENT SYSTEM =====

1. Create Account
2. Deposit Money
3. Withdraw Money
4. Check Balance
5. Display All Accounts
6. Exit
```

### 1. Create Account

Allows the user to create a new bank account by entering:

* Customer ID
* Customer Name
* Phone Number
* Account Number
* Initial Deposit

### 2. Deposit Money

Allows the user to deposit money into an existing account.

The system:

* Searches for the account number
* Checks whether the deposit amount is valid
* Adds the amount to the existing balance
* Displays the updated balance

### 3. Withdraw Money

Allows the user to withdraw money from an existing account.

The system:

* Searches for the account number
* Checks whether the withdrawal amount is valid
* Checks available balance
* Prevents withdrawal when sufficient balance is not available
* Displays the remaining balance

### 4. Check Balance

Allows the user to check the current balance of an account.

The system searches for the given account number and displays the available balance.

### 5. Display All Accounts

Displays the details of all accounts stored in the system, including:

* Customer ID
* Customer Name
* Phone Number
* Account Number
* Account Balance

### 6. Exit

Closes the Banking Management System and displays a thank-you message.

## Technologies Used

* Java
* Object-Oriented Programming
* ArrayList
* Scanner
* VS Code / Eclipse IDE

## Project Structure

```text
BankingManagementSystem/
│
├── Customer.java
├── Account.java
├── Bank.java
├── Main.java
└── README.md
```

## Class Description

### Customer.java

Stores customer information such as customer ID, name, and phone number.

### Account.java

Manages account information and provides methods for depositing, withdrawing, and displaying account details.

### Bank.java

Manages multiple accounts using `ArrayList` and provides methods for adding, searching, depositing, withdrawing, checking balance, and displaying accounts.

### Main.java

Contains the main program and provides the menu-driven interface for performing all banking operations.

## Java Concepts Used

* Classes and Objects
* Constructors
* Encapsulation
* Methods
* Getters
* Object Relationships
* ArrayList
* Loops
* Conditional Statements
* Switch-Case
* User Input using Scanner

## How to Run

### Compile the Project

Open the terminal inside the project folder and run:

```bash
javac *.java
```

### Run the Project

```bash
java Main
```

## Sample Workflow

```text
1. Create Account
   ↓
2. Deposit Money
   ↓
3. Withdraw Money
   ↓
4. Check Balance
   ↓
5. Display All Accounts
   ↓
6. Exit
```

## Validation

The system handles basic invalid operations such as:

* Invalid deposit amount
* Invalid withdrawal amount
* Insufficient account balance
* Account not found
* No accounts available

## Learning Outcomes

This project helped develop practical knowledge of:

* Java programming
* Object-Oriented Programming
* ArrayList and collections
* Logical problem-solving
* Methods and class design
* Input handling
* Basic validation
* Debugging and testing
* Console application development

## Future Enhancements

The system can be extended with:

* MySQL database connectivity
* User authentication
* Transaction history
* Fund transfer
* Different account types
* Interest calculation
* Graphical User Interface
* Web-based interface
* Secure data storage

## Project Details

**Project Name:** Banking Management System
**Programming Language:** Java
**Application Type:** Console-Based Application
**Development:** Code Tech IT Solutions Internship Project
