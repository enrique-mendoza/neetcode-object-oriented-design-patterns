package neetcode.courses.designpatterns.builder.example;

import neetcode.courses.designpatterns.builder.example.builders.HealthyMealBuilder;
import neetcode.courses.designpatterns.builder.example.builders.VeganMealBuilder;
import neetcode.courses.designpatterns.builder.example.directors.Director;
import neetcode.courses.designpatterns.builder.example.products.Meal;

public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        VeganMealBuilder builder = new VeganMealBuilder();
        director.constructVeganMeal(builder);

        Meal veganMeal = builder.build();

        System.out.println("Meal constructed: ");
        System.out.println("Starter: " + veganMeal.getStarter());
        System.out.println("Main: " + veganMeal.getMain());
        System.out.println("Dessert: " + veganMeal.getDessert());
        System.out.println("Drink: " + veganMeal.getDrink());

        HealthyMealBuilder builder2 = new HealthyMealBuilder();
        director.constructHealthyMeal(builder2);
        Meal healthyMeal = builder2.build();

        System.out.println("Meal constructed: ");
        System.out.println("Starter: " + healthyMeal.getStarter());
        System.out.println("Main: " + healthyMeal.getMain());
        System.out.println("Dessert: " + healthyMeal.getDessert());
        System.out.println("Drink: " + healthyMeal.getDrink());
    }
}
