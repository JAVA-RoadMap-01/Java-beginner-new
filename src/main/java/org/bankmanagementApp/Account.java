package org.bankmanagementApp;

public class Account {
    
    private String accountNumber;
    private Double accountBalance;
    private String accountType;

    public Account(String accountNumber, Double accountBalance, String accountType) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountType = accountType;
    }
        
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "Account Details [accountNumber=" + accountNumber + ", accountBalance=" + accountBalance + ", accountType="
                + accountType + "]";
    }

}
