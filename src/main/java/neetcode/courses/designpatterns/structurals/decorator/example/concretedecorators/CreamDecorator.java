package neetcode.courses.designpatterns.structurals.decorator.example.concretedecorators;

import neetcode.courses.designpatterns.structurals.decorator.example.components.Beverage;
import neetcode.courses.designpatterns.structurals.decorator.example.decorators.BeverageDecorator;

public class CreamDecorator extends BeverageDecorator {

    public CreamDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return 0.3 + beverage.cost();
    }

    @Override
    public String description() {
        return beverage.description() + ", Cream";
    }
}
