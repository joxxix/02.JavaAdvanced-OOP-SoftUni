package p03_ManKind;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] studentInput = scan.nextLine().split(" ");
        String[] workerInput = scan.nextLine().split(" ");

        String studentFirstName = studentInput[0];
        String studentLastName = studentInput[1];
        String studentFacultyNum = studentInput[2];

        String workerFirstName = workerInput[0];
        String workerLastName = workerInput[1];
        double workerWeekSalary = Double.parseDouble(workerInput[2]);
        double workerWorkHours = Double.parseDouble(workerInput[3]);

        try {
            Student student = new Student(studentFirstName,
                    studentLastName,
                    studentFacultyNum);

            Worker worker = new Worker(workerFirstName,
                    workerLastName,
                    workerWeekSalary,
                    workerWorkHours);

            System.out.println(student);
            System.out.println(worker);

        } catch (IllegalArgumentException error) {
            System.out.println(error.getMessage());
        }
    }
}
