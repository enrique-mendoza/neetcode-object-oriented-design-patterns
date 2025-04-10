package neetcode.courses.designpatterns.structurals.decorator.example.concretecomponents;

import neetcode.courses.designpatterns.structurals.decorator.example.components.Beverage;

public class LightRoast extends Beverage {

    @Override
    public double cost() {
        return 3.45;
    }

    @Override
    public String description() {
        return "Light Roast";
    }
}
