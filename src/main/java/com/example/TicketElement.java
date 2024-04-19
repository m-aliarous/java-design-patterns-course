package com.example;

public interface TicketElement {

    int getPrice();
    void accept(ElementVisitor visitor);

}
