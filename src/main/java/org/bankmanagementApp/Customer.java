package org.bankmanagementApp;

public class Customer {
    
    private String customerName;
    private String customerAddress;
    private Long customerPhoneNumber;
    private String customerEmail;

    public Customer(String customerName, String customerAddress, Long customerPhoneNumber, String customerEmail) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerEmail = customerEmail;
    }

    @Override
    public String toString(){
        return "Customer details [Customer Name=" + customerName + ", Customer Address=" + customerAddress + ", Customer Phone Number = " + customerPhoneNumber + ", Customer Email=" + customerEmail + "]";
    }
}
