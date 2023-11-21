# Bank-Management
Bank Class and BankClient class
Bank Class:
The Bank class is designed to represent a simple banking system with properties and methods for managing individual bank accounts. It includes the following features:

Properties:

accountNum (private): Represents the unique account number assigned by the bank to each account.
balance (private): Stores the current balance of the bank account.
fname (private): Holds the full name of the account owner.
numAccts (private static): Represents the number of accounts instantiated from the Bank class.

Constructors:

Default Constructor: Sets the initial balance to zero and the name to "Jane Doe."
Parameterized Constructor: Allows the user to set the initial name and balance amount.
Methods:

getBalance(): Returns the current balance for the account.
setWithdrawal(double amount): Performs a withdrawal from the account, ensuring there are sufficient funds.
setDeposit(double amount): Accepts an amount from the user and deposits it into the account.
getAccountNum(): Generates and returns the account number for the account.
getNumAccts() (static): Returns the number of accounts instantiated from the Bank class.


BankClient Class:
The BankClient class serves as the main class to test and demonstrate the functionalities of the Bank class. It includes the following features:

Main Method:

main(String[] args): Instantiates three bank accounts (objects) from the Bank class (acct1 and acct2 and acct3).
Prints Account Information: Prints the balance, account number, and name for each account.
It withdraws money from an account and performs a transfer of money from two different accounts.
Compares Balances and Objects: Compares the balances of the two accounts and checks if they are the same object.

Summary:
In summary, the Bank class encapsulates the properties and behaviors of an individual bank account, and the BankClient class demonstrates the use of the Bank class by creating instances, performing operations, and displaying account information. The code promotes encapsulation and demonstrates the concept of object-oriented programming in a banking context.
