import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         * Bank System
         * deadline : 19.02.24, 11:00
         * Account деген класс тузунуз ,анын сөзсүз double
         * balance деген полясы болот жана сиз  каалагандай
         * поле кошсонуз болот
         * checkBalance -  балансты текшеруу,
         * deposit() - баланска акча кошот ,
         * withdrawal() - баланстан акча алат
         * transaction() - бир account тан экинчи account ка акча
         * которуу методору болсун.
         * main методдон  2-3 account тузуп ар кандай
         * операцияларды жасаныз.
         */

        System.out.println(" welcome to Optima Bank");
        Account account = new Account();
        Scanner scanner = new Scanner(System.in);

        int code = 1233;

        System.out.println("Enter your PIN code:");
        int a = scanner.nextInt();
        if (a != code) {
            System.out.println("PIN code is not correct");

        } else if (code == a)

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
                        account.checkBalance();
                        System.out.println();
                    }
                    case 2 -> {
                        System.out.println("Enter the amount to top up the balance: ");
                        double num = scanner.nextDouble();
                        account.deposit(num);

                    }
                    case 3 -> {
                        System.out.println("Enter the deductible amount: ");
                        double num = scanner.nextInt();
                        account.withdrawal(num);


                    }
                    case 4 -> {
                        System.out.println("What names do you wanna enter? Write the name and surname:"+ scanner.nextLine());
                        switch(scanner.nextLine()){
                            case "Beknazar Joldoshbekov" -> {
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
