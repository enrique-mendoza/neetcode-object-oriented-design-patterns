package neetcode.courses.designpatterns.structurals.decorator.exercise.concretedecorators;

import neetcode.courses.designpatterns.structurals.decorator.exercise.components.Coffee;
import neetcode.courses.designpatterns.structurals.decorator.exercise.decorators.CoffeeDecorator;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return 0.5 + super.getCost();
    }
}
