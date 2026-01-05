package org.bankmanagementApp;
import java.util.Date;
public class Transaction implements withDrawAmount {
    
    private String transactionId;
    private String transactionType;
    private Double transactionAmount;
    private Date transactionDate;

    public Transaction(String transactionId,String transactionType,Double transactionAmount,Date transactionDate){
        this.transactionAmount=transactionAmount;
        this.transactionDate=transactionDate;
        this.transactionId=transactionId;
        this.transactionType=transactionType;
    }

    public String depositAmount(){
        if (transactionType.equalsIgnoreCase("DEPOSIT")){
            return "Amount deposited successfully.";
        }
        else {
            return "Invalid transaction type for deposit.";
        }
    } 
    
    public String withdrawAmount(Double amount){
        if (transactionType.equalsIgnoreCase("WITHDRAW")){
            return "Amount withdrawn successfully : " + amount;
        }
        else {
            return "Invalid transaction type for withdrawal.";
        }
    }
    
    @Override
    public String toString(){
        return "Transaction Details : [Transaction ID=" + transactionId + ", Transaction Type=" + transactionType + ", Transaction Amount=" + transactionAmount + ", Transaction Date=" + transactionDate + "]";
    }


}
