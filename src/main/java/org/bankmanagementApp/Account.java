package org.bankmanagementApp;

public class Account {
    
    private String accountNumber;
    private Double accountBalance;
    private String accountType;

    public Account(String accountNumber, Double accountBalance, String accountType, Customer accountHolderDetails) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountType = accountType;
    }

    public void accountTypeDetails(String accountType){
        if(accountType.equalsIgnoreCase("Savings"))
            System.out.println("This is a Savings Account.");
        else if(accountType.equalsIgnoreCase("Current"))
            System.out.println("This is a Current Account.");
        else
            System.out.println("Invalid account type.");
    }

    @Override
    public String toString() {
        return "Account [accountNumber=" + accountNumber + ", accountBalance=" + accountBalance + ", accountType="
                + accountType + "]";
    }

}
