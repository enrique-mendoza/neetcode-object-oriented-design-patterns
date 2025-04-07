package neetcode.courses.designpatterns.behaviourals.state.exercise.concretestates;

import neetcode.courses.designpatterns.behaviourals.state.exercise.contexts.Document;
import neetcode.courses.designpatterns.behaviourals.state.exercise.states.State;

public class Review implements State {

    @Override
    public void handleRequest(Document doc) {
        if (doc.isApproved()) {
            doc.setState(new Published());
        } else {
            doc.setState(new Draft());
        }
    }
}
