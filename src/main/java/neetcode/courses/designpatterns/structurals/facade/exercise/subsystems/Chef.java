package neetcode.courses.designpatterns.structurals.facade.exercise.subsystems;

public class Chef {
    
    public Food prepareFood(Order order) {
        return new Food(order.getContents());
    }
}
