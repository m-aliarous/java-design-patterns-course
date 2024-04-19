/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example;

/**
 *
 * @author mstf
 */
public interface ElementVisitor {
    void visit(AdultTicket element);
    void visit(GroupTicket element);
}
