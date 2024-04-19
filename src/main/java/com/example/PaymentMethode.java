/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example;

/**
 *
 * @author mstf
 */
public interface PaymentMethode {
    void pay();
    
    PaymentMethode payWithCard = ()-> System.out.println("Payment made with card");
    PaymentMethode payByBankTransfer = ()-> System.out.println("Payment made by bank transfer");

}
