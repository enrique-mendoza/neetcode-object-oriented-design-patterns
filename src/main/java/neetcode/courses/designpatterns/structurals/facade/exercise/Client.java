package neetcode.courses.designpatterns.structurals.facade.exercise;

import neetcode.courses.designpatterns.structurals.facade.exercise.facades.DriveThruFacade;
import neetcode.courses.designpatterns.structurals.facade.exercise.subsystems.Food;

public class Client {

    public static void main(String[] args) {
        DriveThruFacade driveThru = new DriveThruFacade();

        Food dineInFood = driveThru.takeOrder("Burger and Fries", /* takeOut= */ false);
        dineInFood.getFood(); // "Burger and Fries"

        Food takeOutFood = driveThru.takeOrder("Pizza", /* takeOut= */ true);
        takeOutFood.getFood(); // "Pizza in a bag"
    }
}
