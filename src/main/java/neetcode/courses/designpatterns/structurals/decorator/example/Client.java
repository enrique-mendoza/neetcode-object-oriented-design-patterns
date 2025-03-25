package neetcode.courses.designpatterns.structurals.decorator.example;

import neetcode.courses.designpatterns.structurals.decorator.example.components.Beverage;
import neetcode.courses.designpatterns.structurals.decorator.example.concretecomponents.LightRoast;
import neetcode.courses.designpatterns.structurals.decorator.example.concretedecorators.CreamDecorator;
import neetcode.courses.designpatterns.structurals.decorator.example.concretedecorators.EspressoDecorator;
import neetcode.courses.designpatterns.structurals.decorator.example.concretedecorators.FoamDecorator;

public class Client {
    
    public static void main(String[] args) {
        Beverage beverage = new FoamDecorator(
            new CreamDecorator(new EspressoDecorator(new LightRoast()))
        );

        System.out.println(beverage.description()); // Light Roast, Espresso, Cream, Foam
        System.out.println(beverage.cost()); // 4.45
    }
}
