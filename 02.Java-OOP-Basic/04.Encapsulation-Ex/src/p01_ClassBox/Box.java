package p01_ClassBox;

public class Box {
    private double lenght;
    private double width;
    private double height;

    Box(double lenght, double width, double height) {
        this.lenght = lenght;
        this.width = width;
        this.height = height;
    }

    public double calcSurfaceArea(double lenght, double width, double height){
        double result = 0;
        result = (2 * lenght * width) + (2 * lenght * height) + (2 * width * height);
        return result;
    }


    public double calcLeteralSurfaceArea(double lenght, double width, double height){
        double result = 0;
        result =  (2 * lenght * height) + (2 * width * height);
        return result;
    }


    public double calcvolume(double lenght, double width, double height){
        double result = 0;
        result = lenght * width * height;
        return result;
    }

}
