package p03_TestClient;

public class BankAccount {
    private int id;
    private double balance;

    BankAccount(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    void deposit(double amount){
        this.balance += amount;
    }

    void withdraw(double amount){
        if (this.balance - amount < 0){
            System.out.println("Insufficient balance");
        }else {
            this.balance -= amount;
        }
    }

    @Override
    public String toString(){
        return "ID" + this.id;
    }
}
