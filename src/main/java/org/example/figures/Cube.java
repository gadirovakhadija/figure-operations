package org.example.figures;

public class Cube extends Cuboid {
    private double sideLength;

    public Cube() {
    }


    public Cube(double sideLength) {
        super(sideLength, sideLength, sideLength);
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
        setLength(sideLength);
        setHeight(sideLength);
        setWidth(sideLength);
    }
}
