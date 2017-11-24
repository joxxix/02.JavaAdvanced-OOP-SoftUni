package p05_SpeedRacing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countCars = Integer.parseInt(scan.nextLine());

        Map<String, Car> cars = new LinkedHashMap<>();

        while(countCars-- > 0){
            String[] tokens = scan.nextLine().split("\\s+");

            String model = tokens[0];
            Double fuel = Double.parseDouble(tokens[1]);
            Double costPerKM = Double.parseDouble(tokens[2]);

            Car car = new Car(model, fuel, costPerKM);

            cars.putIfAbsent(model,car);
        }

        while (true){

            String[] tokens = scan.nextLine().split("\\s+");

            if (tokens[0].equals("End")){
                break;
            }
            try {
                cars.get(tokens[1]).driveCar(Integer.parseInt(tokens[2]));
            }catch (IllegalStateException ise){
                System.out.println(ise.getMessage());
            }
        }

        cars.values().forEach(System.out::println);
    }
}
