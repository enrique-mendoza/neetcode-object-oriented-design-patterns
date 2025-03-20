package neetcode.courses.designpatterns.singleton.exercise.singleton;

public class Singleton {

    private static Singleton uniqueInstance = null;

    private String value;

    private Singleton() {
        this.value = null;
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }

        return uniqueInstance;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
