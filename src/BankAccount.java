import java.util.Random;
import java.util.Scanner;

public class BankAccount {
    private String accountHolderName;
    private int accountNumber;
    private double balance;

    public BankAccount(Scanner sc, Random random){
        System.out.println("Please, create your bank account username");
        this.accountHolderName = sc.next();
        this.accountNumber = random.nextInt(10000);
        this.balance = 0;
        System.out.println("Your bank account has been successfully created! \nUsername: ".concat(accountHolderName)+"\nAccount number: " + accountNumber);
    }
    public void deposit(){
        Scanner scAmount = new Scanner(System.in);
        System.out.println("Please, enter the deposit into your account");
        double depositAmount = scAmount.nextDouble();
        balance += depositAmount;
        System.out.println("Your new balance is: " + balance);
    }
    public double withdraw(double withdrawAmount){
        Scanner scWithdraw = new Scanner(System.in);
        System.out.println("Please, enter the amount of money you want to withdraw from you account");
        withdrawAmount = scWithdraw.nextDouble();
        if (balance>= withdrawAmount) {
            balance = balance - withdrawAmount;
        }else {
            System.out.println("Transaction unsuccessful. Insufficient funds");
        }
        System.out.println("Your new balance is: " + balance);
        return balance;
    }
    public double checkBalance() {
        System.out.println("Your balance is: " + balance);
//        this.deposit(100);
        return balance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        BankAccount firstUser = new BankAccount(sc, random);
        firstUser.deposit();
    }

}
