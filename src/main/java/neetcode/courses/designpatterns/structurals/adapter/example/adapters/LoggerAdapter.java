package neetcode.courses.designpatterns.structurals.adapter.example.adapters;

import neetcode.courses.designpatterns.structurals.adapter.example.adaptees.XmlLogger;
import neetcode.courses.designpatterns.structurals.adapter.example.targets.JsonLogger;

public class LoggerAdapter implements JsonLogger {

    private final XmlLogger xmlLogger;

    public LoggerAdapter(XmlLogger xmlLogger) {
        this.xmlLogger = xmlLogger;
    }

    @Override
    public void logMessage(String message) {
        xmlLogger.log(message);
    }
}
