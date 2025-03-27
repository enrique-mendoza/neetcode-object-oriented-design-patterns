package neetcode.courses.designpatterns.behaviourals.strategy.example.concretestrategies;

import neetcode.courses.designpatterns.behaviourals.strategy.example.strategies.Lockeable;

public class NonLocking implements Lockeable {

    @Override
    public void lock() {
        System.out.println("Door does not lock - ignoring");
    }

    @Override
    public void unlock() {
        System.out.println("Door cannot unlock because it cannot lock");
    }
}
