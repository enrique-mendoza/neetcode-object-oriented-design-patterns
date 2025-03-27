package neetcode.courses.designpatterns.behaviourals.strategy.example.concretestrategies;

import neetcode.courses.designpatterns.behaviourals.strategy.example.strategies.Openable;

public class Revolving implements Openable {

    @Override
    public void open() {
        System.out.println("Opening revolving door");
    }

    @Override
    public void close() {
        System.out.println("Closing revolving door");
    }
}
