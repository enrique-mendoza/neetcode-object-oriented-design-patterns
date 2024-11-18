package neetcode.courses.designpatterns.factory.example.creators;

import neetcode.courses.designpatterns.factory.example.products.Burger;
import neetcode.courses.designpatterns.factory.example.enums.Burgers;

public abstract class BurgerStore {

    public abstract Burger createBurger(Burgers item);

    public Burger orderBurger(Burgers type) {
        Burger burger = createBurger(type);

        System.out.println("--- Making a " + burger.getName() + " ---");

        burger.prepare();
        burger.cook();
        burger.serve();

        return burger;
    }
}
