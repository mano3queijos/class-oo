package br.ucsal.advancedjava.Solid.L;

public class WithoutLP {


class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Método adicional que não faz sentido para um círculo
    public void drawRectangle() {
        // ...
    }
}

	
}
