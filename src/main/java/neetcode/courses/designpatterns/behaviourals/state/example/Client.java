package neetcode.courses.designpatterns.behaviourals.state.example;

import neetcode.courses.designpatterns.behaviourals.state.example.contexts.TrafficLight;

public class Client {

    public static void main(String[] args) {
        TrafficLight lightSystem = new TrafficLight();

        lightSystem.change(); // Red - Stop!
        lightSystem.change(); // Yellow (from Red to Green) - caution!
        lightSystem.change(); // Green - go!
        lightSystem.change(); // Yellow (from Green to Red) - caution!
        lightSystem.change(); // Red - Stop!
        lightSystem.change(); // Yellow (from Red to Green) - caution!
        lightSystem.change(); // Green - go!
    }
}
