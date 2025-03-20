package neetcode.courses.designpatterns.prototype.exercise.concretes;

import neetcode.courses.designpatterns.prototype.exercise.prototypes.Shape;

public class Rectangle implements Shape {

    private int width;

    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this.width, this.height);
    }
}
