package neetcode.courses.designpatterns.creationals.factorymethod.example.products;

import java.util.ArrayList;

public class Burger {

    public String name;

    public String bread;

    public String sauce;

    public ArrayList<String> toppings = new ArrayList<String>();

    public void prepare() {
        // ...
    }

    public void cook() {
        //...
    }

    public void serve() {
        // ...
    }

    public String getName() {
        return name;
    }
}
