package neetcode.courses.designpatterns.structurals.decorator.exercise.concretedecorators;

import neetcode.courses.designpatterns.structurals.decorator.exercise.components.Coffee;
import neetcode.courses.designpatterns.structurals.decorator.exercise.decorators.CoffeeDecorator;

public class CreamDecorator extends CoffeeDecorator {

    public CreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return 0.7 + super.getCost();
    }
}
