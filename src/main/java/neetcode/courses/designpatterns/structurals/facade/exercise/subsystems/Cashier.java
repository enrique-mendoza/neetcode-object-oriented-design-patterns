package neetcode.courses.designpatterns.structurals.facade.exercise.subsystems;

public class Cashier {
    
    public Order takeOrder(String contents, boolean takeOut) {
        return new Order(contents, takeOut);
    }
}
