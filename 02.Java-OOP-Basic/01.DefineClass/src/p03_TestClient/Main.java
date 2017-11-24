package p03_TestClient;

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
                case "Create": createBankAccount(Integer.parseInt(listOfcommands[1]));
                    break;
                case "Deposit": depositInBankAccoutn(Integer.parseInt(listOfcommands[1]), Double.parseDouble(listOfcommands[2]));
                    break;
                case "Withdraw": withdrawInBankAccount(Integer.parseInt(listOfcommands[1]), Double.parseDouble(listOfcommands[2]));
                    break;
                case "Print":
                    printAccount(Integer.parseInt(listOfcommands[1]));
                    break;
            }
        }
    }

    private static void printAccount(int id) {
        if (accounts.containsKey(id)){
        System.out.printf("Account ID%s, balance %.2f%n",id,accounts
                .get(id)
                .getBalance());
        }else {
            System.out.println("Account does not exist");
        }

    }

    private static void withdrawInBankAccount(int id, double sum) {
        if (!accounts.containsKey(id)){
            System.out.println("Account does not exist");
        }else  if (accounts.containsKey(id)){
            accounts.get(id).withdraw(sum);
        }
    }

    private static void depositInBankAccoutn(int id, double sum) {
        if (!accounts.containsKey(id)){
            System.out.println("Account does not exist");
        }else {
            accounts.get(id).deposit(sum);
        }
    }


    private static void createBankAccount(int id) {
        if (accounts.containsKey(id)){
            System.out.println("Account already exists");
        }else {
            BankAccount acc = new BankAccount(id);
            accounts.put(id,acc);
        }
    }
}
