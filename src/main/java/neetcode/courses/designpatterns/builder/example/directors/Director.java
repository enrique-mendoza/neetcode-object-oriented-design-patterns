package neetcode.courses.designpatterns.builder.example.directors;

import neetcode.courses.designpatterns.builder.example.builders.Builder;

public class Director {

  public void constructVeganMeal(Builder builder) {
    builder.addStarter();
    builder.addMainCourse();
    builder.addDessert();
    builder.addDrink();
  }

  public void constructHealthyMeal(Builder builder) {
    builder.addStarter();
    builder.addMainCourse();
    builder.addDessert();
    builder.addDrink();
  }
}
