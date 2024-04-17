/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

/**
 *
 * @author mstf
 */
public class StartWithCapitalLetter implements Expression{

    private final EndWithDote endWithDote = new EndWithDote();
    @Override
    public String interpret(String context) {
        context = context.substring(0,1).toUpperCase()+context.substring(1);
        return endWithDote.interpret(context);
    }
    
}
