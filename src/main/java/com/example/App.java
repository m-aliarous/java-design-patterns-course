package com.example;

public class App {

    public static void main(String[] args) {
        var request = new WithdrawalRequest(20, WithdrawalRequest.Currency.EUR);
        var atm = buildChain();
        atm.dispense(request);
    }
    public static ATM buildChain(){
    var euroATM = new EuroATM(null);
    var usATM = new UsDollarATM(euroATM);
    return usATM;
    }

}
