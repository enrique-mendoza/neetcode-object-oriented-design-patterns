package neetcode.courses.designpatterns.behaviourals.state.example.concretestates;

import neetcode.courses.designpatterns.behaviourals.state.example.contexts.TrafficLight;
import neetcode.courses.designpatterns.behaviourals.state.example.states.TrafficLightState;

public class RedState implements TrafficLightState {

    @Override
    public void changeState(TrafficLight light) {
        System.out.println("Red - Stop!");
        light.setState(new YellowState());
    }
}
