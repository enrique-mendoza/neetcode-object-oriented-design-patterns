package neetcode.courses.designpatterns.structurals.facade.exercise.subsystems;

public class Order {

    private String contents;

    private boolean takeOut;

    public Order(String contents, boolean takeOut) {
        this.contents = contents;
        this.takeOut = takeOut;
    }

    public String getContents() {
        return contents;
    }

    public boolean isTakeOut() {
        return takeOut;
    }
}
