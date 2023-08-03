package org.example.figures;

import org.example.config.Figure;

public class Cuboid extends Figure {

    private double length;
    private double height;
    private double width;

    public Cuboid() {
    }

    public Cuboid(double length, double height, double width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    @Override
    public double getVolume() {
        return length * width * height;
    }

    @Override
    public double getSphereArea() {
        return 2 * (width * height + height * length + length * width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


}
