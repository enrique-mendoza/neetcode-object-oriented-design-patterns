package neetcode.courses.designpatterns.structurals.facade.exercise.subsystems;

public class KitchenStaff {
    
    public PackagedFood packageOrder(Food food) {
        return new PackagedFood(food);
    }
}
