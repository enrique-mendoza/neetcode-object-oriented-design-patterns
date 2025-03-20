package neetcode.courses.designpatterns.creationals.builder.example.builders;

import neetcode.courses.designpatterns.creationals.builder.example.enums.Dessert;
import neetcode.courses.designpatterns.creationals.builder.example.enums.Drink;
import neetcode.courses.designpatterns.creationals.builder.example.enums.Main;
import neetcode.courses.designpatterns.creationals.builder.example.enums.Starter;
import neetcode.courses.designpatterns.creationals.builder.example.products.Meal;

public class VeganMealBuilder implements Builder {

  private Meal meal;

  public VeganMealBuilder() {
    this.meal = new Meal();
  }

  @Override
  public void addStarter() {
    meal.setStarter(Starter.SALAD);
  }

  @Override
  public void addMainCourse() {
    meal.setMain(Main.VEGGIE_STIR_FRY);
  }

  @Override
  public void addDessert() {
    meal.setDessert(Dessert.VEGAN_PUDDING);
  }

  @Override
  public void addDrink() {
    meal.setDrink(Drink.VEGAN_SHAKE);
  }

  public Meal build() {
    return this.meal;
  }
}
