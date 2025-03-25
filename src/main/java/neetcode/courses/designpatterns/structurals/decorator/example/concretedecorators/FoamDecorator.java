package neetcode.courses.designpatterns.structurals.decorator.example.concretedecorators;

import neetcode.courses.designpatterns.structurals.decorator.example.components.Beverage;
import neetcode.courses.designpatterns.structurals.decorator.example.decorators.BeverageDecorator;

public class FoamDecorator extends BeverageDecorator {

    public FoamDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }

    @Override
    public String description() {
        return beverage.description() + ", Foam";
    }
}
