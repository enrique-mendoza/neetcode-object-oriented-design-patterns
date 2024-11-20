package neetcode.courses.designpatterns.factorymethod.example.creators;

import neetcode.courses.designpatterns.factorymethod.example.products.Burger;
import neetcode.courses.designpatterns.factorymethod.example.enums.Burgers;
import neetcode.courses.designpatterns.factorymethod.example.products.CheeseBurger;
import neetcode.courses.designpatterns.factorymethod.example.products.DeluxeCheeseBurger;

public class CheeseBurgerStore extends BurgerStore {

    @Override
    public Burger createBurger(Burgers item) {
        if (item.equals(Burgers.CHEESE)) {
            return new CheeseBurger();
        } else if (item.equals(Burgers.DELUXECHEESE)) {
            return new DeluxeCheeseBurger();
        } else return null;
    }
}
