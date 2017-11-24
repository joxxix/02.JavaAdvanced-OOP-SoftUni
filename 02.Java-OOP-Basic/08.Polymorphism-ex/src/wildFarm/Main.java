package wildFarm;

import wildFarm.abstractions.Animal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Factory af = new Factory();

        String line;
        while(!"End".equals(line = scanner.nextLine())){
            String foodInfo = scanner.nextLine();

            String[] animalInfo = line.split(" ");

            Animal currentAnimal = af.getAnimal(animalInfo);

        }
    }
}
