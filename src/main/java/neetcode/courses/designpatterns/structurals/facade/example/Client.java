package neetcode.courses.designpatterns.structurals.facade.example;

import neetcode.courses.designpatterns.structurals.facade.example.facades.SmartHomeFacade;
import neetcode.courses.designpatterns.structurals.facade.example.subsystems.SmartHomeSubSystem;

public class Client {

    public static void main(String[] args) {
        SmartHomeFacade f = new SmartHomeFacade(new SmartHomeSubSystem());

        f.setMovieMode();
        f.setFocusMode();
    }
}
