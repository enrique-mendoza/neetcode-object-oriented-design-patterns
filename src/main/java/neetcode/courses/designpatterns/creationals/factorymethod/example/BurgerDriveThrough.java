package neetcode.courses.designpatterns.creationals.factorymethod.example;

import neetcode.courses.designpatterns.creationals.factorymethod.example.creators.BurgerStore;
import neetcode.courses.designpatterns.creationals.factorymethod.example.creators.CheeseBurgerStore;
import neetcode.courses.designpatterns.creationals.factorymethod.example.creators.VeganBurgerStore;
import neetcode.courses.designpatterns.creationals.factorymethod.example.enums.Burgers;
import neetcode.courses.designpatterns.creationals.factorymethod.example.products.Burger;

public class BurgerDriveThrough {

    public static void main(String[] args) {
        BurgerStore cheeseStore = new CheeseBurgerStore();
        BurgerStore veganStore = new VeganBurgerStore();

        Burger burger = cheeseStore.orderBurger(Burgers.CHEESE);
        System.out.println("Ethan ordered a " + burger.getName() + "\n");

        burger = veganStore.orderBurger(Burgers.DELUXEVEGAN);
        System.out.println("Joel ordered a " + burger.getName() + "\n");
    }
}
