/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

/**
 *
 * @author mstf
 */
public class DiscountVisitor implements ElementVisitor {

    public void visit(AdultTicket element) {
        element.setPrice(5);
    }

    public void visit(GroupTicket group) {
        group.getElements().forEach(e->e.accept(this));
    }
}
