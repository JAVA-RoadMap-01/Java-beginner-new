package org.prac;

public class UpiPayments implements Payments {
    
   
    @Override
    public void makePayment(Double amount){
        System.out.println("Making UPI payment of amount: " + amount);
    }

    @Override
    public void checkPaymentStatus(String transactionID){
        System.out.println("Checking UPI payment status for transaction ID: " + transactionID);
    }

    public void transferAmount(double transferAmount){
        if(transferAmount > 0){
            System.out.println("Transferred amount via UPI: " + transferAmount);
        } else {
            System.out.println("Invalid transfer amount");
        }
    }
    public static void main(String[] args){
        UpiPayments upi = new UpiPayments();
        upi.makePayment(300.0);
        upi.checkPaymentStatus("TXN12345UPI");
        upi.transferAmount(1500.0);
    }
    
}
