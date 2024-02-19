import java.awt.image.PackedColorModel;

public class Account {
    String name;
    double balance;

    public Account() {

    }

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void checkBalance() {
        System.out.println("Current balance for " + name + " is: " + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully to " + name + ". New balance is: " + balance);
    }

    public void withdrawal(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully from " + name + ". New balance is: " + balance);
        } else {
            System.out.println("Insufficient funds in " + name + " account.");
        }
    }

    public void transaction(double amount) {
        if (amount <= balance) {
            balance -= amount;
            balance += amount;
            System.out.println(amount + " transferred successfully from " + name + " to " + balance);
            System.out.println(name + "'s new balance: " + balance);
            System.out.println(balance + "'s new balance: " + balance);
        } else {
            System.out.println("Insufficient funds in " + name + " account for transaction.");
        }
    }
    public void setBalance(double balance ){

        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }

}



