package neetcode.courses.designpatterns.creationals.prototype.exercise.concretes;

import neetcode.courses.designpatterns.creationals.prototype.exercise.prototypes.Shape;

public class Square implements Shape {

    private int length;

    public Square(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public Shape clone() {
        return new Square(this.length);
    }
}
