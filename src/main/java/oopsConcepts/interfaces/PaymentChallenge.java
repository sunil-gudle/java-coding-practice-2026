package oopsConcepts.interfaces;

import java.util.ArrayList;
import java.util.List;

interface PaymentMethod {
    void pay(double amount);
    String getPaymentType();
}

class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }

    @Override
    public String getPaymentType() {
        return "Credit Card";
    }
}

class UPIPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }

    @Override
    public String getPaymentType() {
        return "UPI";
    }
}

class WalletPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Wallet.");
    }
    @Override
    public String getPaymentType() {
        return "Wallet";
    }
}


public class PaymentChallenge {
    public static void main(String[] args) {
        List<PaymentMethod> methods = new ArrayList<>();
        methods.add(new CreditCardPayment());
        methods.add(new UPIPayment());
        methods.add(new WalletPayment());

        double amount = 500.0;

        for (PaymentMethod method : methods) {
            System.out.println("Processing with: " + method.getPaymentType());
            method.pay(amount);
            System.out.println();
        }
    }
}
