/* Name: Jeremy Luo NetdID: jl12498
Course: [CS101]
Description : BankClient Main Class with notes in program
Date: 11/20
*/

public class BankClient {
    public static void main(String[] args) {
        // Creating accounts
        Bank acct1 = new Bank();                             // Default account
        Bank acct2 = new Bank("Michael Jordan", 1000000);   // Account with custom values
        Bank acct3 = new Bank("Floyd Mayweather Jr.", 9999999); // second account with custom values

        // Printing initial account information
        System.out.println("Initial Account Information:");
        printAccountInfo(acct1); // print all initial accounts info
        printAccountInfo(acct2);
        printAccountInfo(acct3);

        // Making a withdrawal from acct2
        System.out.println("Withdrawing $50 from Account 2:");
        acct2.setWithdrawal(50); // user can custom withdraw

        // Transferring $200 from acct1 to acct2
        System.out.println("Transferring $200 from Account 1 to Account 3:"); // extra credit portion in main class
        acct1.transferFunds(acct3, 200); // user can custom transfer 

        // Printing updated account information after operations
        System.out.println("Account Information After Operations:");
        printAccountInfo(acct1);
        printAccountInfo(acct2);
        printAccountInfo(acct3);

        // Comparing balances and objects
        compareBalances(acct2, acct3);
        compareObjects(acct2, acct3);
    }

    private static void printAccountInfo(Bank account) { // account informations
        System.out.println("Account Number: " + account.getAccountNum());
        System.out.println("Full Name: " + account.getFname());
        System.out.println("Balance: " + account.getBalance());
        System.out.println();
    }

    private static void compareBalances(Bank acct1, Bank acct2) { // compare balances
        if (acct1.getBalance() == acct2.getBalance()) { //equal
            System.out.println("Both accounts have the same balance.");
        } else { // not equal
            System.out.println("The balances are different.");
        }
    }

    private static void compareObjects(Bank acct1, Bank acct2) {
        if (acct1 == acct2) { // check to see if objects are the same
            System.out.println("Both accounts are the same object.");
        } else { // otherwise, they are different
            System.out.println("The accounts are different objects.");
        }
    }
}
