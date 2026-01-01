package org.example;

import java.util.Scanner;

public class BankAccount {
    
    private String accountNumber;
    private String accountHolderName;
    private Double balance;
    private Integer option;
    Scanner scanner = new Scanner(System.in);

    public BankAccount(String accountNumber, String accountHolderName, Double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    private Double withdrawBalance(Double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Current balance is:" + balance);
            return balance;
        } else {
            System.out.println("Insufficient funds");
            System.out.println("Current balance is:" + balance);
            return balance;
        }
        

    }

    private void depositBalance(Double amount){
        balance += amount;
        System.out.println("New balance is:" + balance);
    } 

    private void optionsMenu() {
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("Enter your option:");
        option = scanner.nextInt();
        if(option==1){
            System.out.println("Enter the amount you want to deposit:");
            Double depositAmount = scanner.nextDouble();
            depositBalance(depositAmount);
        }
        else if(option==2){
             System.out.println("Enter the amount you want to withdraw:");
            Double withdrawlAmount = scanner.nextDouble();
            withdrawBalance(withdrawlAmount);
        }
        else{
            System.out.println("Invalid option selected");
        }
    }

    public static void main(String[] args) {
             
        BankAccount account1 = new BankAccount("123456789", "Alice Johnson", 1500.0);
        BankAccount account2 = new BankAccount("987654321", "Bob Smith", 3000.0);

        System.out.println("Account 1 Details:");
        System.out.println("Account Number: " + account1.getAccountNumber());
        System.out.println("Account Holder Name: " + account1.getAccountHolderName());
        System.out.println("Balance: " + account1.getBalance());
        account1.optionsMenu();
        System.out.println("\nAccount 2 Details:");
        System.out.println("Account Number: " + account2.getAccountNumber());
        System.out.println("Account Holder Name: " + account2.getAccountHolderName());
        System.out.println("Balance: " + account2.getBalance());
        account2.optionsMenu();
       
    }
}
