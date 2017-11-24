package p04_DefinePersonClass;

public class BankAccount {
    private final static double DEFAULT_INTEREST = 0.02;

    private static double interestRate = DEFAULT_INTEREST;
    private static int bankAccCount;

    private int id;
    private double balance;

    BankAccount(){
        this.id = ++bankAccCount;
    }

    int getId() {
        return id;
    }

    static void setInterest(double interest) {
        interestRate = interest;
    }

    double getInterest(int years){
        return this.balance * interestRate * years;
    }

    void deposit(double amount){
        this.balance += amount;
    }


    @Override
    public String toString(){
        return "ID" + this.id;
    }
}
