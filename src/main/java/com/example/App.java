package com.example;

public class App {

    public static void main(String[] args) {
        var light = new Light();
        var lightOperExecutor = new LightOperExecutor();
        light.isOn();
        //light.turnOnLight();
        lightOperExecutor.doOper(new TurnOnOper(light));
        light.isOn();
        //light.turnOffLight();
        lightOperExecutor.doOper(new TurnOffOper(light));
        light.isOn();
    }

}
