package p02_BankAccountRenewed;

public class BankAccount {
    private int id;
    private double balance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit (double amount){
        if (amount < 0){
            return;
        }else {
            this.balance += amount;
        }
    }

    public void withdraw (double amount){
        if (this.balance - amount < 0){
            return;
        }else {
            this.balance -= amount;
        }
    }

    @Override
    public String toString(){
        return "ID" + this.id;
    }
}
