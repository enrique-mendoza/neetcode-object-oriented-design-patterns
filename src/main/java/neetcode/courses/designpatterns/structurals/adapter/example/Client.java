package neetcode.courses.designpatterns.structurals.adapter.example;

import neetcode.courses.designpatterns.structurals.adapter.example.adaptees.XmlLogger;
import neetcode.courses.designpatterns.structurals.adapter.example.adapters.LoggerAdapter;
import neetcode.courses.designpatterns.structurals.adapter.example.targets.JsonLogger;

public class Client {
    
    public static void main(String[] args) {
        JsonLogger logger = new LoggerAdapter(new XmlLogger());
        logger.logMessage("<message>hello</message>");
    }
}
