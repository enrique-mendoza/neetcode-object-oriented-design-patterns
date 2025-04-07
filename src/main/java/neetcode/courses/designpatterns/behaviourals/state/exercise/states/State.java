package neetcode.courses.designpatterns.behaviourals.state.exercise.states;

import neetcode.courses.designpatterns.behaviourals.state.exercise.contexts.Document;

public interface State {

    void handleRequest(Document doc);
}
