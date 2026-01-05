package org.bankmanagementApp;
import java.util.Scanner;
public class BankApp {
    
    private CurrentAccount currentAccount = new CurrentAccount("CA12345", 5000.0, "Current", 10000.0);
    private SavingsAccount savingsAccount = new SavingsAccount("SA12345", 3000.0, "Savings", 5.0, 500.0, "8000");
    private Customer customer = new Customer("John Doe", "123 Main St", 9876543210L, "john.doe@example.com");
    private Transaction transaction = new Transaction("T12345", "Deposit", 2000.0, new java.util.Date());
    Account account = new Account("A12345", 10000.0, "Savings");
    
    Scanner scanner = new Scanner(System.in);

    public void startBankApp(){
        System.out.println("Welcome to Bank Management Application");
    }

    public void displayMenu(){
        System.out.println("Please select from below options: 1. Withdraw Amount 2. Check Current Amount 3. View Account Details 4. View Customer Details 5. View Transaction Details");
        savingsAccount.withdrawAmount(400.0);
        currentAccount.withdrawAmount(6000.0);
        transaction.withdrawAmount(500.0);

        account.getAccountBalance();

        System.out.println(savingsAccount.toString());
        System.out.println(currentAccount.toString());
        System.out.println(account.toString());
        System.out.println(customer.toString());
        System.out.println(transaction.toString());

    }

    public void stopBankApp(){
        System.out.println("Thank you for using Bank Management Application");
    }

    public static void main(String[] args){
        BankApp bankApp = new BankApp();
        bankApp.startBankApp();
        System.out.println("Select Account Type: 1. Current Account 2. Savings Account");
        int accountType = bankApp.scanner.nextInt();
        if(accountType == 1){
            System.out.println("You have selected Current Account.");
            bankApp.displayMenu();
        }
        else if(accountType == 2){
            System.out.println("You have selected Savings Account.");
            bankApp.displayMenu();
        }
        else{
            System.out.println("Invalid Account Type selected.");
        }
        bankApp.stopBankApp();

    }
}
