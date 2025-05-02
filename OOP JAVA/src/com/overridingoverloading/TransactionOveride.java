package com.overridingoverloading;
class Payment {
    void pay(double amount) {
        System.out.println("Paying"+amount+"using generic payment method");
    }
}
class CreditCardPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paying "+amount+" using Credit Card.");
    } 
}

// Subclass 1 - UPI Payment
class UPIPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paying "+amount+"using UPI ");
    }
}

// Subclass 2 - Cash Payment


// Main class to test
public class TransactionOveride {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new UPIPayment();
        
        p1.pay(1000); 
        p2.pay(500);
    }
}
