package org.prac;

public interface Payments {
    
    public void makePayment(Double amount);

    public void checkPaymentStatus(String transactionId);

}
