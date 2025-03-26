package neetcode.courses.designpatterns.structurals.facade.example.facades;

import neetcode.courses.designpatterns.structurals.facade.example.enums.Brightness;
import neetcode.courses.designpatterns.structurals.facade.example.enums.Service;
import neetcode.courses.designpatterns.structurals.facade.example.subsystems.SmartHomeSubSystem;

public class SmartHomeFacade {
    
    private SmartHomeSubSystem smartHome;

    public SmartHomeFacade(SmartHomeSubSystem smartHome) {
        this.smartHome = smartHome;
    }

    public void setMovieMode() {
        smartHome.setBrightness(Brightness.DIM);
        smartHome.setTemperature(21);
        smartHome.setIsSecurityArmed(false);
        smartHome.setStreamingService(Service.NETFLIX);
    }

    public void setFocusMode() {
        smartHome.setBrightness(Brightness.BRIGHT);
        smartHome.setTemperature(22);
        smartHome.setIsSecurityArmed(true);
        smartHome.setStreamingService(Service.UNKNOWN);
    }
}
