package neetcode.courses.designpatterns.behaviourals.state.example.contexts;

import neetcode.courses.designpatterns.behaviourals.state.example.concretestates.RedState;
import neetcode.courses.designpatterns.behaviourals.state.example.states.TrafficLightState;

public class TrafficLight {

    private TrafficLightState state;

    private TrafficLightState prevState;

    public TrafficLight() {
        this.state = new RedState();
        this.prevState = null;
    }

    public void setState(TrafficLightState state) {
        this.prevState = this.state;
        this.state = state;
    }

    public TrafficLightState getPrevState() {
        return this.prevState;
    }

    public void change() {
        this.state.changeState(this);
    }
}
