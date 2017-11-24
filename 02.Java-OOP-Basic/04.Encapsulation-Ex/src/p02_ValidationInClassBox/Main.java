package p02_ValidationInClassBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double lenght = Double.parseDouble(scan.nextLine());
        double width = Double.parseDouble(scan.nextLine());
        double height = Double.parseDouble(scan.nextLine());
        try {
            Box box = new Box(lenght, width, height);

            System.out.printf("Surface Area - %.2f%n" , box.calcSurfaceArea(lenght, width,height));
            System.out.printf("Lateral Surface Area - %.2f%n", box.calcLeteralSurfaceArea(lenght, width,height));
            System.out.printf("Volume - %.2f%n", box.calcvolume(lenght, width,height));

        }catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
    }
}
