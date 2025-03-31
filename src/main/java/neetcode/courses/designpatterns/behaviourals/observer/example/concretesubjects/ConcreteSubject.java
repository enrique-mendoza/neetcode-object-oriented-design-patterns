package neetcode.courses.designpatterns.behaviourals.observer.example.concretesubjects;

import neetcode.courses.designpatterns.behaviourals.observer.example.observers.Observer;
import neetcode.courses.designpatterns.behaviourals.observer.example.subjects.Subject;

import java.util.ArrayList;

public class ConcreteSubject extends Subject {

    private ArrayList<Observer> observers = new ArrayList<>();

    private int value = 0;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(value);
        }
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }
}
