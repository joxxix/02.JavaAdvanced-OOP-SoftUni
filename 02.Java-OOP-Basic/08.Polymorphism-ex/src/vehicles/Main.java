package vehicles;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] carInfo = scan.nextLine().split(" ");
        String[] truckInfo = scan.nextLine().split(" ");

        int n = Integer.parseInt(scan.nextLine());

        Vehicles car = new Car(Double.parseDouble(carInfo[1]), Double.parseDouble(carInfo[2]));
        Vehicles truck = new Truck(Double.parseDouble(truckInfo[1]), Double.parseDouble(truckInfo[2]));

        String pattern = "#.##";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);

        for (int i = 0; i < n ; i++) {
            String[] commands = scan.nextLine().split(" ");
            if (commands[0].equals("Drive")){
                if (commands[1].equals("Car")){
                    try {
                        car.drive(Double.parseDouble(commands[2]));
                        System.out.printf("Car travelled %s km\n"
                                , decimalFormat.format(Double.parseDouble(commands[2])));
                    }catch (IllegalStateException ise){
                        System.out.println(ise.getMessage());
                    }
                }else {
                    try {
                        truck.drive(Double.parseDouble(commands[2]));
                        System.out.printf("Truck travelled %s km\n"
                                , decimalFormat.format(Double.parseDouble(commands[2])));
                    }catch (IllegalStateException ise){
                        System.out.println(ise.getMessage());
                    }
                }
            }else if (commands[0].equals("Refuel")){
                if (commands[1].equals("Car")){
                    car.refill(Double.parseDouble(commands[2]));
                }else {
                    truck.refill(Double.parseDouble(commands[2]));
                }
            }
        }


        System.out.println(car);
        System.out.println(truck);

    }
}
