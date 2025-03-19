package neetcode.courses.designpatterns.prototype.example;

import java.util.ArrayList;
import java.util.List;

import neetcode.courses.designpatterns.prototype.example.concretes.Document;
import neetcode.courses.designpatterns.prototype.example.prototypes.DocumentPrototype;

public class Client {

    public static void main(String[] args) {
        List<String> images = new ArrayList<>();
        images.add("Image1.png");
        List<String> annotations = new ArrayList<>();
        annotations.add("Annotation1");

        Document originalDoc = new Document("Hello, World!", images, "Basic", annotations);

        // Cloning the document using the prototype pattern
        DocumentPrototype copiedDoc = (Document) originalDoc.cloneDocument();

        // Making changes to the original document
        originalDoc.addImage("Image2.png");
        originalDoc.addAnnotation("Annotation2");

        // Displaying the contents of both documents
        System.out.println("Original Document:");
        originalDoc.display();
        System.out.println("\nCopied Document:");
        copiedDoc.display();
    }
}
