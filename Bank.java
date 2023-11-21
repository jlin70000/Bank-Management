
/* Name: Jeremy Luo NetdID: jl12498
Course: [CS101]
Description : Bank Class with notes in class
Date: 11/20
*/

public class Bank {
    private static int numAccts = 0;  // Class variable to keep track of the number of accounts instantiated
    private static int accountNum = 2; // Class variable to keep track of the account numbers instantiated
    private int acctNum;  // Instance variable to store account number
    private double balance;  // Private variable to store balance
    private String fname;  // Private variable to store full name

    

    // Default constructor
    public Bank() {
        // Assign a fixed account number 0 for default constructor
        if (fname == null || fname.isEmpty()) {
            this.acctNum = 1;
        } else {
            this.acctNum = generateAccountNum();  // For non-default instances, use the random account number
        }

        this.balance = 0;  // Set the initial balance to 0 for the default constructor
        this.fname = "Jane Doe";
        numAccts++;  // Increment the number of accounts to keep track
    }

    // Parameterized constructor
    public Bank(String fname, double initialBalance) {
        this.acctNum = generateAccountNum();  // Assign a unique account number
        this.balance = initialBalance;
        this.fname = fname;
        numAccts++;  // Increment the number of accounts to keep track
        accountNum++; // Increment the account numbers so it is unique
    }

    private int generateAccountNum() { 
    		return accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setWithdrawal(double amount) {  
        if (amount <= balance) { // check to see if user can withdraw
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
            System.out.println();

        } else {   // otherwise, you cannot withdraw
            System.out.println("Insufficient funds. Withdrawal unsuccessful.");
        }
    }

    public void setDeposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    public void transferFunds(Bank destinationAccount, double amount) { // EXTRA CREDIT added technical feature
        if (amount > 0 && amount <= balance) { // check to see if transfer is possible
            setWithdrawal(amount);  // Withdraw from the source account
            destinationAccount.setDeposit(amount);  // Deposit into the destination account
            System.out.println("Transfer successful. Transferred $" + amount + " to account " + destinationAccount.getAccountNum());
            System.out.println();

        } else { // otherwise it is unsuccessful
            System.out.println("Transfer unsuccessful. Invalid amount or insufficient funds.");
            System.out.println();

        }
    }

    public int getAccountNum() {
        return acctNum;  // Use instance variable for account number
    }

    public static int getNumAccts() {
        return numAccts;
    }

    // Getter method for fname (EXTRA CREDIT? innovative solution, kept saying "fname couldn't be resolved" so I used getter and it worked.
    public String getFname() {
        return fname;
    }
}