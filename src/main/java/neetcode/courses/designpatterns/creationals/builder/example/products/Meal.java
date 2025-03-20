package neetcode.courses.designpatterns.builder.example.products;

import neetcode.courses.designpatterns.builder.example.enums.Dessert;
import neetcode.courses.designpatterns.builder.example.enums.Drink;
import neetcode.courses.designpatterns.builder.example.enums.Main;
import neetcode.courses.designpatterns.builder.example.enums.Starter;

public class Meal {

    private Starter starter;

    private Main main;

    private Dessert dessert;

    private Drink drink;

    public Starter getStarter() {
        return this.starter;
    }

    public Main getMain() {
        return this.main;
    }

    public Dessert getDessert() {
        return this.dessert;
    }

    public Drink getDrink() {
        return this.drink;
    }

    public void setStarter(Starter starter) {
        this.starter = starter;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }
}
