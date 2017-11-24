package p04_DefinePersonClass;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static HashMap<Integer,BankAccount> accounts = new HashMap<>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true){
            String[] listOfcommands = scan.nextLine().split("\\s+");

            String command = listOfcommands[0];

            if (command.equals("End")){
                break;
            }

            switch (command){
                case "Create": createBankAccount();
                    break;
                case "Deposit": depositInBankAccoutn(Integer.parseInt(listOfcommands[1]), Double.parseDouble(listOfcommands[2]));
                    break;
                case "SetInterest": setInterest(Double.parseDouble(listOfcommands[1]));
                    break;
                case "GetInterest": getInterest(Integer.parseInt(listOfcommands[1]), Integer.parseInt(listOfcommands[2]));
                    break;
            }
        }
    }

    private static void getInterest(int id, int year) {
        if (accounts.containsKey(id)){
            System.out.printf("%.2f%n", accounts.get(id).getInterest(year));
        }else {
            System.out.println("Account does not exist");
        }
    }

    private static void setInterest(double interest) {
        BankAccount.setInterest(interest);
    }

    private static void depositInBankAccoutn(int id, double sum) {
        if (!accounts.containsKey(id)){
            System.out.println("Account does not exist");
        }else {
            accounts.get(id).deposit(sum);
            System.out.printf("Deposited %.0f to ID%d%n", sum,id );
        }
    }


    private static void createBankAccount() {
            BankAccount acc = new BankAccount();
            accounts.put(acc.getId(), acc);
        System.out.println("Account ID"+acc.getId()+" created");
    }
}

