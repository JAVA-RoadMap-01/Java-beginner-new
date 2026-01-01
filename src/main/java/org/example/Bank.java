package org.example;

public class Bank {
    
    private String name;
    private String address;
    private String bic;
    private String bankName;
    private static String bankCode="BANK001";
    private Double accountBalance;

    public Bank(String name, String address, String bic, String bankName, Double accountBalance) {
        this.name = name;
        this.address = address;
        this.bic = bic;
        this.bankName = bankName;
        this.accountBalance = accountBalance;
    }

    public  static void main(String[] args){

        Bank bank1 = new Bank("John Doe", "123 Main St", "BIC12345", "Example Bank",  1000.0);
        Bank bank2 = new Bank("Jane Smith", "456 Elm St", "BIC67890", "Sample Bank", 2500.0);
        System.out.println("First Customer details:");
        System.out.println("Bank created for customer: " + bank1.name);
        System.out.println("Bank Address" + bank1.address);
        System.out.println("BIC: " + bank1.bic);
        System.out.println("Bank Name: " + bank1.bankName);
        System.out.println("Bank Code: " +bankCode);
        System.out.println("Account Balance: " + bank1.accountBalance);

        System.out.println("Second Customer details:");
        System.out.println("Bank created for customer: " + bank2.name);
        System.out.println("Bank Address" + bank2.address);
        System.out.println("BIC: " + bank2.bic);
        System.out.println("Bank Name: " + bank2.bankName);
        System.out.println("Bank Code: " + bankCode);
        System.out.println("Account Balance: " + bank2.accountBalance);

    }
}

