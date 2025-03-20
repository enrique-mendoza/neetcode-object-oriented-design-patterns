package neetcode.courses.designpatterns.creationals.prototype.example.concretes;

import java.util.ArrayList;
import java.util.List;

import neetcode.courses.designpatterns.creationals.prototype.example.prototypes.DocumentPrototype;

public class Document implements DocumentPrototype {

    private String content;

    private List<String> images;

    private String formatting;

    private List<String> annotations;

    public Document(String content, List<String> images, String formatting,
                    List<String> annotations) {
        this.content = content;
        this.images = new ArrayList<>(images); // Deep copy of images list
        this.formatting = formatting;
        this.annotations = new ArrayList<>(annotations); // Deep copy of annotations list
    }

    @Override
    public DocumentPrototype cloneDocument() {
        // Deep copy of ComplexDocument
        return new Document(this.content, this.images, this.formatting,
                this.annotations);
    }

    @Override
    public void display() {
        System.out.println("Content: " + content);
        System.out.println("Images: " + images);
        System.out.println("Formatting: " + formatting);
        System.out.println("Annotations: " + annotations);
    }

    // Additional methods to manipulate the document (for demonstration purposes)
    public void addImage(String image) {
        images.add(image);
    }

    public void addAnnotation(String annotation) {
        annotations.add(annotation);
    }
}
