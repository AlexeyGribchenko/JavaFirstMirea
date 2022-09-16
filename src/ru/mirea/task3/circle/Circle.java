package ru.mirea.task3.circle;

public class Circle {
    private float radius;
    private float diameter;
    private float length;
    private float xCenter;
    private float yCenter;

    public float getRadius() {
        return radius;
    }

    public float getXCenter() {
        return xCenter;
    }

    public float getYCenter() {
        return yCenter;
    }

    public float getDiameter() {
        return diameter;
    }

    public float getLength() {
        return length;
    }

    public void setRadius(float radius) {
        this.radius = radius;
        this.diameter = radius * 2;
        this.length = (float)(this.diameter * Math.PI);
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
        this.radius = diameter / 2;
        this.length = (float)(diameter * Math.PI);
    }

    public void setLength(float length) {
        this.length = length;
        this.radius = (float)(length / (2 * Math.PI));
        this.diameter = 2 * this.radius;
    }

    public void setXCenter(float xCenter) {
        this.xCenter = xCenter;
    }

    public void setYCenter(float yCenter) {
        this.yCenter = yCenter;
    }

    public void setXYCenter(float xCenter, float yCenter) {
        this.xCenter = xCenter;
        this.yCenter = yCenter;
    }

    public Circle() {
        setXYCenter(0, 0);
        setRadius(0);
    }

    public Circle(float xCenter, float yCenter, float radius) {
        setXYCenter(xCenter, yCenter);
        setRadius(radius);
    }

    public String toString() {
        return "Radius: " + this.radius +
                " Diameter: " + this.diameter +
                " Length: " + this.length +
                " Position (x, y): (" + this.xCenter +
                ", " + this.yCenter + ")";
    }
}
