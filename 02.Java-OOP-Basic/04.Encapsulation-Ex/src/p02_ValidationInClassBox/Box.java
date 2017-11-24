package p02_ValidationInClassBox;

class Box {
    private double length;
    private double width;
    private double height;

    Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    private void setLength(double length) {
        if (length <= 0){
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
        this.length = length;
    }

    private void setWidth(double width) {
        if (width <= 0){
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    private void setHeight(double height) {
        if (height <= 0){
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.height = height;
    }

    double calcSurfaceArea(double length, double width, double height){
        double result = 0;
        result = (2 * length * width) + (2 * length * height) + (2 * width * height);
        return result;
    }


    double calcLeteralSurfaceArea(double length, double width, double height){
        double result = 0;
        result =  (2 * length * height) + (2 * width * height);
        return result;
    }


    double calcvolume(double length, double width, double height){
        double result = 0;
        result = length * width * height;
        return result;
    }

}
