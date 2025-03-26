package neetcode.courses.designpatterns.structurals.facade.exercise.subsystems;

public class Food {
    
    private String contents;

    public Food(String contents) {
        this.contents = contents;
    }

    public String getFood() {
        return contents;
    }
}
