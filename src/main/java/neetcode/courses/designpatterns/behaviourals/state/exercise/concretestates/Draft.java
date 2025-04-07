package neetcode.courses.designpatterns.behaviourals.state.exercise.concretestates;

import neetcode.courses.designpatterns.behaviourals.state.exercise.contexts.Document;
import neetcode.courses.designpatterns.behaviourals.state.exercise.states.State;

public class Draft implements State {

    @Override
    public void handleRequest(Document doc) {
        doc.setState(new Draft());
    }
}
