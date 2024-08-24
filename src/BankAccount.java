import java.util.Random;
import java.util.Scanner;

public class BankAccount {
    private String accountHolderName;
    private int accountNumber;
    private double balance;

    public BankAccount(Scanner sc, Random random){
        System.out.println("Welcome to Hello Kitty Bank! \nPlease, enter your bank account username");
        this.accountHolderName = sc.next();
        this.accountNumber = random.nextInt(10000);
        this.balance = 0;
        System.out.println("Your Hello Kitty bank account has been successfully created! \nUsername: ".concat(accountHolderName)+"\nAccount number: " + accountNumber);
    }
    public void deposit(Scanner sc){
        System.out.println("Please, enter the deposit into your account");
        balance +=  sc.nextDouble();
        System.out.println("Your new balance is: " + balance);
    }
    public void withdraw(Scanner sc){
        System.out.println("Please, enter the amount of money you want to withdraw from your account");
        double withdrawalAmount = sc.nextDouble();
        if (balance>= withdrawalAmount) {
            balance = balance - withdrawalAmount;
            System.out.println("Your new balance is: " + balance);
        }else {
            System.out.println("Transaction unsuccessful. Insufficient funds" + balance);
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
