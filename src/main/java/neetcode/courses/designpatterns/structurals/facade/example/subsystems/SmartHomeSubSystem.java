package neetcode.courses.designpatterns.structurals.facade.example.subsystems;

import neetcode.courses.designpatterns.structurals.facade.example.enums.Brightness;
import neetcode.courses.designpatterns.structurals.facade.example.enums.Service;

public class SmartHomeSubSystem {

    private Brightness brightness;

    private int temperature;

    private boolean isSecurityArmed;

    private Service streamingService;

    public SmartHomeSubSystem() {
        this.brightness = Brightness.UNKNOWN;
        this.temperature = 19;
        this.isSecurityArmed = false;
        this.streamingService = Service.UNKNOWN;
    }

    public void setBrightness(Brightness brightness) {
        this.brightness = brightness;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setIsSecurityArmed(boolean isSecurityArmed) {
        this.isSecurityArmed = isSecurityArmed;
    }

    public void setStreamingService(Service streamingService) {
        this.streamingService = streamingService;
    }

    private void enableMotionSensors() {
        // ...
    }

    private void updateFirmware() {
        // ...
    }
}
