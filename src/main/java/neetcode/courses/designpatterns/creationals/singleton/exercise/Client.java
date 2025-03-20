package neetcode.courses.designpatterns.creationals.singleton.exercise;

import neetcode.courses.designpatterns.creationals.singleton.exercise.singleton.Singleton;

public class Client {

    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();

        s.getValue(); // null

        s.setValue("a value string");
        s.getValue(); // "a value string"

        Singleton s2 = Singleton.getInstance();

        s2.getValue(); // "a value string"
    }
}
