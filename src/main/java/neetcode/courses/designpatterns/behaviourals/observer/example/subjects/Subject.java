package neetcode.courses.designpatterns.behaviourals.observer.example.subjects;

import neetcode.courses.designpatterns.behaviourals.observer.example.observers.Observer;

public abstract class Subject {

    public abstract void registerObserver(Observer o);

    public abstract void removeObserver(Observer o);

    public abstract void notifyObservers();
}
