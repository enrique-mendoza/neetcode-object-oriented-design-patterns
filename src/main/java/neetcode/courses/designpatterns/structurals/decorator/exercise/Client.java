package neetcode.courses.designpatterns.structurals.decorator.exercise;

import neetcode.courses.designpatterns.structurals.decorator.exercise.components.Coffee;
import neetcode.courses.designpatterns.structurals.decorator.exercise.concretecomponents.SimpleCoffee;
import neetcode.courses.designpatterns.structurals.decorator.exercise.concretedecorators.CreamDecorator;
import neetcode.courses.designpatterns.structurals.decorator.exercise.concretedecorators.MilkDecorator;
import neetcode.courses.designpatterns.structurals.decorator.exercise.concretedecorators.SugarDecorator;

public class Client {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        coffee.getCost(); // 1.1

        coffee = new MilkDecorator(coffee);
        coffee.getCost(); // 1.6

        coffee = new SugarDecorator(coffee);
        coffee.getCost(); // 1.8

        coffee = new CreamDecorator(coffee);
        coffee.getCost(); // 2.5
    }
}
