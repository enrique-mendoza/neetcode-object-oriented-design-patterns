package neetcode.courses.designpatterns.behaviourals.state.exercise.contexts;

import neetcode.courses.designpatterns.behaviourals.state.exercise.concretestates.Draft;
import neetcode.courses.designpatterns.behaviourals.state.exercise.states.State;

public class Document {
    
    private State state;

    private boolean isApproved;

    public Document() {
        this.state = new Draft();
    }

    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void publish() {
        this.state.handleRequest(this);
    }

    public void setApproval(boolean isApproved) {
        this.isApproved = isApproved;
    }

    public boolean isApproved() {
        return this.isApproved;
    }
}
