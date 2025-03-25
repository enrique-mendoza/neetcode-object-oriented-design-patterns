package neetcode.courses.designpatterns.structurals.decorator.exercise.decorators;

import neetcode.courses.designpatterns.structurals.decorator.exercise.components.Coffee;

public abstract class CoffeeDecorator extends Coffee {
    
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    public double getCost() {
        return decoratedCoffee.getCost();
    }
}
