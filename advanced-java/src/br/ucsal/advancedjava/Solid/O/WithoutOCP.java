package br.ucsal.advancedjava.Solid.O;

public class WithoutOCP {

}

class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateCircleArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateRectangleArea() {
        return width * height;
    }
}
