package _06OOP.ClassAndInheritance.Exercise8;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = (radius >= 0) ? radius : 0;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
        // Or return Math.PI * this.radius * this.radius;
    }
}
