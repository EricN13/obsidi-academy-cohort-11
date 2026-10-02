package com.bptn.course_05_oop.paymentExample;

public class PaymentExample {
    public static void main(String[] args) {
        Payment creditPayment = new Payment("Jane Doe", 5000.00f);
        Payment debitPayment = new Payment("Test User", 1000.00f);

        creditPayment.checkDetails();

        debitPayment.makePayment(50);

        Payment.showInterest();
        Payment.showCount();
    }
}
