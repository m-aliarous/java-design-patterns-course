/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

/**
 *
 * @author mstf
 */
public class Mediator {

    private PedestrianCrossingLight pedestrianCrossingLight;
    private TrafficLight trafficLight;

    public Mediator(PedestrianCrossingLight pedestrianCrossingLight, TrafficLight trafficLight) {
        this.pedestrianCrossingLight = pedestrianCrossingLight;
        this.trafficLight = trafficLight;
    }

    public void changeTrafficLightToRed() {
        trafficLight.changeToRed();
        pedestrianCrossingLight.changeToGreen();
    }

    public void changeTrafficLightToAmber() {
        trafficLight.changeToAmber();
    }

    public void changeTrafficLightToGreen() {
        pedestrianCrossingLight.changeToRed();
        trafficLight.changeToGreen();

    }
}
