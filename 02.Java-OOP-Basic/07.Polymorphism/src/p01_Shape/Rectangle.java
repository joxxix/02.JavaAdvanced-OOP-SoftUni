package p01_Shape;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(double perimeter, double area, double height, double width) {
        super(perimeter, area);
        this.height = height;
        this.width = width;
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

    @Override
    public void calculatePerimeter() {
       super.setPerimeter(this.width * this.height);
    }

    @Override
    public void calculateArea() {
        super.setArea(2 * (this.width * this.height));
    }
}
