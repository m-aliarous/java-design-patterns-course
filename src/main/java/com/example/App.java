package com.example;

public class App {
    
    public static void main(String[] args) {
        
        var checkoutPage = new CheckoutPage();

//        checkoutPage.payWithCard();
        checkoutPage.pay(PaymentMethode.payWithCard);
//        checkoutPage.payByBankTransfer();
        checkoutPage.pay(PaymentMethode.payByBankTransfer);
        
    }
    
}
