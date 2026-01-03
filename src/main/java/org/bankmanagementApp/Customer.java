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

    public void displayCustomerDetails(){
        System.out.println("Customer Name:" + customerName);
        System.out.println(":Customer Address" + customerAddress);
        System.out.println("Customer Phone Number:" + customerPhoneNumber);
        System.out.println("Customer Email:" + customerEmail);
    }
}
