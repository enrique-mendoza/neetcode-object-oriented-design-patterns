package neetcode.courses.designpatterns.behaviourals.strategy.example.concretestrategies;

import neetcode.courses.designpatterns.behaviourals.strategy.example.strategies.Openable;

public class Sliding implements Openable {

    @Override
    public void open() {
        System.out.println("Opening sliding door");
    }

    @Override
    public void close() {
        System.out.println("Closing sliding door");
    }
}
