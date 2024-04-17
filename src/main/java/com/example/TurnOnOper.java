/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

/**
 *
 * @author mstf
 */
public class TurnOnOper implements IlightOper{
    private final Light light;
    
    public TurnOnOper(Light light){
    this.light = light;
    }
    public void excute(){
     light.turnOnLight();
    }
}
