package neetcode.courses.designpatterns.behaviourals.state.example.states;

import neetcode.courses.designpatterns.behaviourals.state.example.contexts.TrafficLight;

public interface TrafficLightState {
    
    void changeState(TrafficLight trafficLight);
}
