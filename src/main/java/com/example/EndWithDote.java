/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

/**
 *
 * @author mstf
 */
public class EndWithDote implements Expression{

    @Override
    public String interpret(String context) {
        if(context.endsWith(".")) return context;
        return context+".";
    }
    
}
