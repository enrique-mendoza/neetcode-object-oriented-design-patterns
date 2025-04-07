package neetcode.courses.designpatterns.behaviourals.state.example.concretestates;

import neetcode.courses.designpatterns.behaviourals.state.example.contexts.TrafficLight;
import neetcode.courses.designpatterns.behaviourals.state.example.states.TrafficLightState;

public class YellowState implements TrafficLightState {

    @Override
    public void changeState(TrafficLight light) {
        if (light.getPrevState() instanceof RedState) {
            System.out.println("Yellow (from Red to Green) - caution!");
            light.setState(new GreenState());
        } else {
            System.out.println("Yellow (from Green to Red) - caution!");
            light.setState(new RedState());
        }
    }
}
