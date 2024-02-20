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
        System.out.println("Your balance is  : " + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("You have topped up your balance with: " + balance);
    }

    public void withdrawal(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("You have accepted your balance : " + balance);
        } else {
            System.out.println("Insufficient funds in account");
        }
    }

    public void transaction(double amount) {
        if (amount <= balance) {
            balance -= amount;
            balance += amount;
            System.out.println(amount + " transferred successfully  to Elon Musk " );
            System.out.println( " new balance: " + balance);
            System.out.println(balance + "  new balance balance");
        } else {
            System.out.println("Insufficient funds in  account for transaction.");
        }
    }
    public void setBalance(double balance ){

        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }

}



