package neetcode.courses.designpatterns.creationals.builder.example.builders;

import neetcode.courses.designpatterns.creationals.builder.example.enums.Dessert;
import neetcode.courses.designpatterns.creationals.builder.example.enums.Drink;
import neetcode.courses.designpatterns.creationals.builder.example.enums.Main;
import neetcode.courses.designpatterns.creationals.builder.example.enums.Starter;
import neetcode.courses.designpatterns.creationals.builder.example.products.Meal;

public class HealthyMealBuilder implements Builder {

  private Meal meal;

  public HealthyMealBuilder() {
    this.meal = new Meal();
  }

  @Override
  public void addStarter() {
    meal.setStarter(Starter.SALAD);
  }

  @Override
  public void addMainCourse() {
    meal.setMain(Main.GRILLED_CHICKEN);
  }

  @Override
  public void addDessert() {
    meal.setDessert(Dessert.FRUIT_SALAD);
  }

  @Override
  public void addDrink() {
    meal.setDrink(Drink.WATER);
  }

  public Meal build() {
    return this.meal;
  }
}
