/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

/**
 *
 * @author mstf
 */
public abstract class Pizza {

    public void makeBase() {
        System.out.println("Mix flour, yeast and salt.");
        System.out.println("Roll out the dough.");
    }

    abstract void addToppings();

    public void cook() {
        System.out.println("Cook in the oven for 20 minutes");
    }
}
