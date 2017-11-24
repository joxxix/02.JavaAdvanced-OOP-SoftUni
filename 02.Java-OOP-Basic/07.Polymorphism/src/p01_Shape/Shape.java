package p01_Shape;

public abstract class Shape {
    private double perimeter;
    private double area;

    public Shape(double perimeter, double area) {
        this.setPerimeter(perimeter);
        this.setArea(area);
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setArea(double area) {
        this.area = area;
    }

    abstract void calculatePerimeter();

    abstract void calculateArea();
}
