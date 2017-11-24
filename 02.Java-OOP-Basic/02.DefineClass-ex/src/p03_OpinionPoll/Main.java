package p03_OpinionPoll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numOfNames = Integer.parseInt(scan.nextLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < numOfNames ; i++) {
            String[] nameAndAge = scan.nextLine().split(" ");

            String name = nameAndAge[0];
            int age = Integer.parseInt(nameAndAge[1]);

            if (age > 30){
                Person person = new Person(name , age);

                people.add(person);
            }
        }

        people.stream().sorted(Comparator.comparing(Person::getName)).forEach(System.out::println);

    }
}
