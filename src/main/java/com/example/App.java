package com.example;

public class App {

    public static void main(String[] args) {

        var trafficLight = new TrafficLight();
        var pedestrianCrossingLight = new PedestrianCrossingLight();
        var mediator = new Mediator(pedestrianCrossingLight, trafficLight);
        trafficLight.changeToAmber();
        mediator.changeTrafficLightToGreen();
        trafficLight.changeToAmber();
        mediator.changeTrafficLightToRed();


    }

}
