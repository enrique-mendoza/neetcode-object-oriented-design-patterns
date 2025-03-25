package neetcode.courses.designpatterns.structurals.decorator.example.decorators;

import neetcode.courses.designpatterns.structurals.decorator.example.components.Beverage;

public abstract class BeverageDecorator extends Beverage {
    
    protected Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
