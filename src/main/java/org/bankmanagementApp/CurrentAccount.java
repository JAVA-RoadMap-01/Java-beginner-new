package org.bankmanagementApp;

public class CurrentAccount extends Account implements withDrawAmount{
    
    private Double overdraftLimit;
    private Account account;

    public CurrentAccount(String accountNumber, Double accountBalance, String accountType,Double overdraftLimit) {
        super(accountNumber, accountBalance, accountType);
        this.overdraftLimit = overdraftLimit;
    }

    public String withdrawAmount(Double amount){
        if (amount <account.getAccountBalance()){
            account.setAccountBalance(account.getAccountBalance() - amount);
            return "Amount withdrawn successfully.";
        }
        else if(amount <= (account.getAccountBalance() + overdraftLimit)){
            account.setAccountBalance(account.getAccountBalance() - amount);
            return "Amount withdrawn successfully using overdraft.";
        }   
        else {
            return " Insufficient balance";
        }
    }

    @Override
    public String toString(){
        return "Current Account details [Overdraft Limit=" + overdraftLimit + "]";
    }
}
