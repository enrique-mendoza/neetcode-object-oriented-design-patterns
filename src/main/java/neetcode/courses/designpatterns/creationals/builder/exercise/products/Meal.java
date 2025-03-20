package neetcode.courses.designpatterns.creationals.builder.exercise.products;

public class Meal {

    private double cost;

    private boolean takeOut;

    private String main;

    private String drink;

    public double getCost() {
        return this.cost;
    }

    public boolean getTakeOut() {
        return this.takeOut;
    }

    public String getMain() {
        return this.main;
    }

    public String getDrink() {
        return this.drink;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setTakeOut(boolean takeOut) {
        this.takeOut = takeOut;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
}
