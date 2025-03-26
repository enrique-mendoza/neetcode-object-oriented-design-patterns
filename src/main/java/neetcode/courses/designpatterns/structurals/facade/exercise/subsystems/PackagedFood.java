package neetcode.courses.designpatterns.structurals.facade.exercise.subsystems;

public class PackagedFood extends Food {
    
    public PackagedFood(Food food) {
        super(food.getFood() + " in a bag");
    }
}
