package neetcode.courses.designpatterns.behaviourals.strategy.example.concretestrategies;

import neetcode.courses.designpatterns.behaviourals.strategy.example.strategies.Lockeable;

public class Password implements Lockeable {

    @Override
    public void lock() {
        System.out.println("Door locked using password!");
    }

    @Override
    public void unlock() {
        System.out.println("Door unlocked using password!");
    }
}
