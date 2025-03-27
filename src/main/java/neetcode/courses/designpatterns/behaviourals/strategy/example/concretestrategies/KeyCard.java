package neetcode.courses.designpatterns.behaviourals.strategy.example.concretestrategies;

import neetcode.courses.designpatterns.behaviourals.strategy.example.strategies.Lockeable;

public class KeyCard implements Lockeable {

    @Override
    public void lock() {
        System.out.println("Door locked using keycard!");
    }

    @Override
    public void unlock() {
        System.out.println("Door unlocked using keycard!");
    }
}
