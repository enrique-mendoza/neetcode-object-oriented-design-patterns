package neetcode.courses.designpatterns.structurals.adapter.exercise.adapter;

import neetcode.courses.designpatterns.structurals.adapter.exercise.adaptees.Circle;
import neetcode.courses.designpatterns.structurals.adapter.exercise.targets.Square;

public class CircleToSquareAdapter extends Square {

    private final Circle circle;

    public CircleToSquareAdapter(Circle circle) {
        super(0);
        this.circle = circle;
    }

    @Override
    public double getSideLength() {
        return this.circle.getRadius() * 2;
    }
}
