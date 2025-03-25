package neetcode.courses.designpatterns.structurals.decorator.exercise.concretedecorators;

import neetcode.courses.designpatterns.structurals.decorator.exercise.components.Coffee;
import neetcode.courses.designpatterns.structurals.decorator.exercise.decorators.CoffeeDecorator;

public class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return 0.2 + super.getCost();
    }
}
