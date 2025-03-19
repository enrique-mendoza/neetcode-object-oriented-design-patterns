package neetcode.courses.designpatterns.prototype.exercise;

import java.util.ArrayList;
import java.util.List;

import neetcode.courses.designpatterns.prototype.exercise.prototypes.Shape;

public class Test {

    public List<Shape> cloneShapes(List<Shape> shapes) {
        List<Shape> clonedShapes = new ArrayList<>();

        for (Shape shape : shapes) {
            clonedShapes.add(shape.clone());
        }

        return clonedShapes;
    }
}
