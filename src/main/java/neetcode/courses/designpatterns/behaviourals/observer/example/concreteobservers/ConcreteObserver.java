package neetcode.courses.designpatterns.behaviourals.observer.example.concreteobservers;

import neetcode.courses.designpatterns.behaviourals.observer.example.observers.Observer;
import neetcode.courses.designpatterns.behaviourals.observer.example.subjects.Subject;

public class ConcreteObserver implements Observer {

    private int value;

    private Subject subject;
    
    public ConcreteObserver(Subject sSub) {
        subject = sSub;
        subject.registerObserver(this);
    }

    @Override
    public void update(int value) {
        this.value = value;
    }
}
