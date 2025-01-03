package Day7;
import java.util.Scanner;

class Account {
    private double balance;

    public Account(double initialBalance) {
        balance = initialBalance;
    }

    public void debit(double amount) {
        if (amount > balance) {
            System.out.println("Debit amount exceeded account balance.");
        } else {
            balance -= amount;
            System.out.printf("Debited: %.2f, New Balance: %.2f%n", amount, balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}

class AccountTest {
    public static void testDebit() {
        Account account = new Account(100.0);
        System.out.printf("Initial Balance: %.2f%n", account.getBalance());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to debit: ");
        double amount = scanner.nextDouble();
        account.debit(amount);
    }
}

public class AccountManagement {
    public static void main(String[] args) {
        AccountTest.testDebit();
    }
}
