import java.util.Random;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
    }
        private String accountHolderName;
        private int accountNumber;
        private double balance;

    public BankAccount(String accountHolderName, double balance, int accountNumber, Scanner sc, Random random){
            this.balance = 0;
            this.accountHolderName = sc.next();
            this.accountNumber = random.nextInt(10000);
        }
}
