package neetcode.courses.designpatterns.structurals.facade.exercise.facades;

import neetcode.courses.designpatterns.structurals.facade.exercise.subsystems.Cashier;
import neetcode.courses.designpatterns.structurals.facade.exercise.subsystems.Chef;
import neetcode.courses.designpatterns.structurals.facade.exercise.subsystems.Food;
import neetcode.courses.designpatterns.structurals.facade.exercise.subsystems.KitchenStaff;
import neetcode.courses.designpatterns.structurals.facade.exercise.subsystems.Order;

public class DriveThruFacade {
    
    private Cashier cashier = new Cashier();

    private Chef chef = new Chef();

    private KitchenStaff kitchenStaff = new KitchenStaff();

    public Food takeOrder(String orderContents, boolean takeOut) {
        Order order = cashier.takeOrder(orderContents, takeOut);
        Food food = chef.prepareFood(order);

        return takeOut ? kitchenStaff.packageOrder(food) : food;
    }
}
