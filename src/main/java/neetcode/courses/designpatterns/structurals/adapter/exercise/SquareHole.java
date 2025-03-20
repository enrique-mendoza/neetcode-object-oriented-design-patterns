package neetcode.courses.designpatterns.structurals.adapter.exercise;

import neetcode.courses.designpatterns.structurals.adapter.exercise.targets.Square;

public class SquareHole {
    
    private double sideLength;

    public SquareHole(double sideLength) {
        this.sideLength = sideLength;
    }

    public boolean canFit(Square square) {
        return this.sideLength >= square.getSideLength();
    }
}
