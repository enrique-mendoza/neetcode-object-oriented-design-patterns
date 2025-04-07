package neetcode.courses.designpatterns.behaviourals.state.exercise.concretestates;

import neetcode.courses.designpatterns.behaviourals.state.exercise.contexts.Document;
import neetcode.courses.designpatterns.behaviourals.state.exercise.states.State;

public class Published implements State {

    @Override
    public void handleRequest(Document doc) {
        // Final state, no action needed
    }
}
