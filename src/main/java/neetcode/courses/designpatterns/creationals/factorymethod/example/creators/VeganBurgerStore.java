package neetcode.courses.designpatterns.creationals.factorymethod.example.creators;

import neetcode.courses.designpatterns.creationals.factorymethod.example.products.Burger;
import neetcode.courses.designpatterns.creationals.factorymethod.example.enums.Burgers;
import neetcode.courses.designpatterns.creationals.factorymethod.example.products.DeluxeVeganBurger;
import neetcode.courses.designpatterns.creationals.factorymethod.example.products.VeganBurger;

public class VeganBurgerStore extends BurgerStore {

    @Override
    public Burger createBurger(Burgers item) {
        if (item.equals(Burgers.VEGAN)) {
            return new VeganBurger();
        } else if (item.equals(Burgers.DELUXEVEGAN)) {
            return new DeluxeVeganBurger();
        } else return null;
    }
}
