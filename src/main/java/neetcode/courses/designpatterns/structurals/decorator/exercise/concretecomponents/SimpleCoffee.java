package neetcode.courses.designpatterns.structurals.decorator.exercise.concretecomponents;

import neetcode.courses.designpatterns.structurals.decorator.exercise.components.Coffee;

public class SimpleCoffee extends Coffee {

    @Override
    public double getCost() {
        return 1.1;
    }
}
