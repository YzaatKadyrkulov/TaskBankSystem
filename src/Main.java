import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(" welcome to Optima Bank");
        Account account = new Account();
        Scanner scanner = new Scanner(System.in);

        int code = 1233;

        System.out.println("Enter your PIN code:");
        int a = scanner.nextInt();
        if (a != code) {
            System.out.println("PIN code is not correct");

        } else if (code == a) {

            while(true){
                System.out.println("""
                        1 Check your balance
                         2 Deposit's money:
                         3 Take cash:
                         4 Change PIN code:
                         5 Switch to a selection of languages double
                                     """);


                switch (scanner.nextInt()){
                    case 0 -> {
                        return;
                    }
                    case 1 -> {
                        System.out.println("My balance: ");
                        account.getBalances();
                        System.out.println();
                    }
                    case 2 -> {
                        System.out.println("Enter the amount to top up the balance: ");
                        double num = scanner.nextDouble();
                        account.withdrawMoney(num);
                        account.balances = account.checkBalances(account.balances, num);
                        System.out.println("My balance " + num + " added to the displayed amount!");
                    }
                    case 3 -> {
                        System.out.println("Enter the deductible amount: ");
                        double num = scanner.nextInt();
                        account.withdrawMoney(num);
                        System.out.println("Your balance after withdrawal: ");
                        account.getBalances();
                    }
                    case 4 -> {
                        System.out.println("What do you translate for? Write the name or surname:"+ scanner.nextLine());
                        switch(scanner.nextLine()){
                            case "BeknazarJoldoshbekov" -> {
                                System.out.println("Write the amount: ");
                                double number1 = scanner.nextDouble();
                                account.transaction(number1);
                                System.out.println("The transaction was completed successfully! \n");
                            }
                            case "Elon Mask" -> {
                                System.out.println("Write the amount:");
                                double number2 = scanner.nextDouble();
                                account.transaction(number2);
                                System.out.println("The transaction was completed successfully!");
                            }
                        }
                    }
                }
            }
        }
    }
}