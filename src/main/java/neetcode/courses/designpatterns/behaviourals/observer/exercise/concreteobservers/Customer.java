package neetcode.courses.designpatterns.behaviourals.observer.exercise.concreteobservers;

import neetcode.courses.designpatterns.behaviourals.observer.exercise.observers.Observer;

public class Customer implements Observer {

    private String name;

    private int notifications;

    public Customer(String name) {
        this.name = name;
        this.notifications = 0;
    }

    @Override
    public void notify(String itemName) {
        this.notifications += 1;
    }

    public int countNotifications() {
        return this.notifications;
    }
}
