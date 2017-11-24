package p01_Shape;

public class Circle extends Shape {
    private double radius;

    public Circle(double perimeter, double area, double radius) {
        super(perimeter, area);
        this.radius = radius;
    }

    final double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    void calculatePerimeter() {
        super.setPerimeter(2 * (Math.PI * this.radius));
    }

    @Override
    void calculateArea() {
        super.setArea(Math.PI * this.radius * this.radius);
    }
}
