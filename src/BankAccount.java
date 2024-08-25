import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class BankAccount {
    private String accountHolderName;
    private int accountNumber;
    private double balance;

    public BankAccount(Scanner sc, Random random){
        System.out.println("Welcome to Hello Kitty Bank!");

                System.out.println("⠀⠀⠀⠀⢀⣀⣀⡀⠀⠀⠀⢀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                System.out.println("⠀⠀⠀⢰⣿⣿⣿⣿⣷⣦⣾⠟⠋⠙⢿⣦⣀⣀⡀⠀⠀⠀⠀⢀⣀⣤⣶⣶⣶⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                System.out.println("⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⠋⠀⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                System.out.println("⠀⢠⣾⠿⠛⠿⢿⣿⠟⠛⠳⣖⠓⡆⠀⠀⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                System.out.println("⠀⢸⣏⠀⠀⢠⠼⡇⠀⠀⠀⢸⠶⠃⠀⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                System.out.println("⠀⠘⣿⡄⠀⠘⠦⠷⣤⣀⣤⣿⣶⣤⣤⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                System.out.println("⠀⠀⣽⣿⣦⣀⣠⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                System.out.println("⠀⣠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠿⠿⠿⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                System.out.println("⠛⠻⣿⣿⣿⣿⣿⠟⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠛⠻⢿⣿⣿⣿⣿⣿⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                System.out.println("⢀⣠⣿⣿⣿⣿⣇⠀⣾⣿⡧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣶⣶⡀⢹⣿⣿⣿⣿⣿⠿⠿⠆⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                System.out.println("⠈⠉⢿⣿⣿⣿⣿⣿⣮⣿⣁⡀⠀⠀⠀⣠⣤⣀⠀⠀⠀⠀⠈⢿⣿⣥⣾⣿⣿⣿⣿⣿⡀⠀⠀⠀⠀⠀⠀⠀⣿⣇⣀⠀");
                System.out.println("⠀⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣶⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⣛⣿⣤⣶⣦⣄⣤⣤⣾⣿⠿⢛⠁");
                System.out.println("⠀⠉⠀⠀⠙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠛⠋⠉⢀⠈⠀⠀⢠");
                System.out.println("⠀⠀⠀⠀⠀⠀⠙⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠛⢿⣿⠿⣿⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠄");
                System.out.println("⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⠀⠀⠀⠛⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⠿⠛⠛⠻⣿⣿⣿⣿⣿⣿⣿⣿⣇⠘⣷⡀⠀⠀⠀⢀⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠂");
                System.out.println("⠀⠀⠀⠀⠀⢀⣤⣾⣏⠀⠀⠀⠀⢲⣾⣿⣿⣿⠟⢻⣿⣿⣿⣧⣘⢷⣦⣤⣴⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                System.out.println("⠀⢀⣤⣴⣿⣿⣿⣿⣿⣦⡀⠀⠀⢸⣿⠏⠁⠀⠀⠀⠙⢿⣿⣿⣿⣿⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                System.out.println("⠀⢿⣿⣿⣿⣿⣿⣿⠋⠈⠙⠛⠺⣿⣿⠀⠀⠀⠀⠀⠀⠀⠉⠻⢿⣿⣿⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                System.out.println("⠀⠘⣿⣿⠿⠋⠁⣽⠳⠶⢤⣤⣤⣉⣉⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣤⣽⡾⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                System.out.println("⠀⠀⠈⠁⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠈⢩⡿⢻⣏⠉⠉⠉⠉⠉⠉⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠂");
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⢻⣄⠀⠀⠀⠀⠀⣠⡾⠁⠀⢻⡄⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠉⠳⠶⠶⠶⠾⠋⠁⠀⠀⠀⠻⢦⣀⣀⠀⣀⣠⡾⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");

        while (true){
            System.out.println("Please, enter your Hello Kitty username: ");
            String userName = sc.nextLine();
            if (userName.matches("[a-zA-Z\\s]+")){
            this.accountHolderName = userName;
                break;
            } else {
                System.out.println("Please. Enter a Hello Kitty user that contains letters only!");
            }
        }

        this.accountNumber = random.nextInt(10000);
        this.balance = 0;
        System.out.println("Your Hello Kitty bank account has been successfully created! \nUsername: ".concat(accountHolderName)+"\nAccount number: " + accountNumber);
    }
    public void deposit(Scanner sc){
        System.out.println("Please, enter the deposit into your account");
        try {
            double depositAmount = sc.nextDouble();
            balance += depositAmount;
            System.out.println("Your new balance is: " + balance);
        } catch (InputMismatchException e){
            System.out.println("Please, enter a valid number.");
            sc.next();
            this.deposit(sc);
        }

    }
    public void withdraw(Scanner sc){
        System.out.println("Please, enter the amount of money you want to withdraw from your account.");
       try {
           double withdrawalAmount = sc.nextDouble();
           if (balance>= withdrawalAmount) {
               balance = balance - withdrawalAmount;
               System.out.println("Your new balance is: " + balance);
           }else {
               System.out.println("Transaction unsuccessful. Insufficient funds. " + balance);
           }
        } catch (InputMismatchException e){
            System.out.println("Please, enter a valid number.");
            sc.next();
            this.withdraw(sc);
        }
    }
    public double checkBalance() {
        System.out.println("Your balance is: " + balance);
        return balance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        BankAccount firstUser = new BankAccount(sc, random);
        firstUser.deposit(sc);
        firstUser.withdraw(sc);
    }

}
