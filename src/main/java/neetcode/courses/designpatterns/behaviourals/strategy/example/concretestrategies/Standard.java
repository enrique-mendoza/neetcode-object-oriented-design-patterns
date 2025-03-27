package neetcode.courses.designpatterns.behaviourals.strategy.example.concretestrategies;

import neetcode.courses.designpatterns.behaviourals.strategy.example.strategies.Openable;

public class Standard implements Openable {

    @Override
    public void open() {
        System.out.println("Pushing door open");
    }

    @Override
    public void close() {
        System.out.println("Pulling door closed");
    }
}
