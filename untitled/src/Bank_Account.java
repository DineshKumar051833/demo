import java.util.Scanner;

public class Bank_Account {
    public static void main(String[] args) {
        String name = "Dinesh";
        int password = 5555;
        int balance = 100;
        int amount = 0;
        System.out.println("Welcome to ATM,,,Enjoy Banking");
        System.out.println("Welcome "+name);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pin: ");
        int pin = sc.nextInt();
        while (true){
            if(password==pin){
                System.out.println("""
                    Enter choice:1.Deposit
                                 2.Withdraw
                                 3.Current Balance
                                 4.Exit
                    """);
                int choice = sc.nextInt();
                switch (choice){
                    case 1:
                        System.out.print("Enter Amount to Deposit: $");
                        amount = sc.nextInt();
                        balance+=amount;
                        System.out.println("Your Current Balance is: $"+balance);
                        break;
                    case 2:
                        if(balance>amount){
                            System.out.print("Enter amount to withdraw: $");
                            amount = sc.nextInt();
                            balance-=amount;
                            System.out.println("Withdrawn Successful!!!");
                            System.out.println("Your Current balance is: $"+balance);
                        }else{
                            System.out.println("Insufficient Blance!!!");
                        }
                        break;
                    case 3:
                        System.out.println("your Current Balance is: $"+balance);
                        break;

                    case 4:

                        System.out.println("Thank You for Banking!!!");
                        System.out.println("Visit Again");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Enter valid choice!!!");
                        break;
                }

            }else{
                System.out.println("Incorrect Pin");
                break;
            }
        }

    }
}