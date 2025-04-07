package neetcode.courses.designpatterns.behaviourals.state.example.concretestates;

import neetcode.courses.designpatterns.behaviourals.state.example.contexts.TrafficLight;
import neetcode.courses.designpatterns.behaviourals.state.example.states.TrafficLightState;

public class GreenState implements TrafficLightState {

    @Override
    public void changeState(TrafficLight light) {
        System.out.println("Green - go!");
        light.setState(new YellowState());
    }
}
