package org.bankmanagementApp;

public class SavingsAccount extends Account implements withDrawAmount {
    
    private Double interestRate;
    private Double minimumBalance;
    private String withdrawalLimit;
    private Account account;

    public SavingsAccount(String accountNumber, Double accountBalance, String accountType,Double interestRate, Double minimumBalance, String withdrawalLimit) {
        super(accountNumber, accountBalance, accountType);
        this.interestRate = interestRate;
        this.minimumBalance = minimumBalance;
        this.withdrawalLimit = withdrawalLimit;
    }

    public String withdrawAmount(Double amount){
        if ((amount > minimumBalance)&&(amount <account.getAccountBalance()) ){
            account.setAccountBalance(account.getAccountBalance() - amount);
            return "Amount withdrawn successfully.";
        }
        else {
            return " Insufficient balance";
        }
    }

    public void checkMinimumBalance(){
        if(account.getAccountBalance() < minimumBalance){
            System.out.println("Account Balance is below the minimum requireedd balance.");
        }
        else if(account.getAccountBalance() == minimumBalance){
            System.out.println("Account Balance is equal to the minimum balance.");
        }
        else{
            System.out.println("Account Balance is more than the minimum balance.");
        }

    }

    @Override
    public String toString(){
        return "Savings Account details [Interest Rate=" + interestRate + ", Minimum Balance=" + minimumBalance + ", Withdrawal Limit=" + withdrawalLimit + "]";
    }
}
