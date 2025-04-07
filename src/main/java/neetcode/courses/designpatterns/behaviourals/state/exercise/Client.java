package neetcode.courses.designpatterns.behaviourals.state.exercise;

import neetcode.courses.designpatterns.behaviourals.state.exercise.contexts.Document;

public class Client {

    public static void main(String[] args) {
        Document document = new Document();

        // document.getState() instanceof Draft; // true

        document.publish();
        // document.getState() instanceof Review; // true

        document.publish();
        // document.getState() instanceof Draft; // true

        document.setApproval(true);
        document.publish(); // Draft -> Review
        document.publish(); // Review -> Published
        // document.getState() instanceof Published; // true

        document.publish();
        // document.getState() instanceof Published; // true
    }
}
