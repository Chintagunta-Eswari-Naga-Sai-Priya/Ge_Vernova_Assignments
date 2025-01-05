package Day22;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Bank class
class Bank {
    private final Map<Integer, Integer> accounts = new HashMap<>();
    private final Lock lock = new ReentrantLock();

    public Bank(int numAccounts, int initialBalance) {
        for (int i = 1; i <= numAccounts; i++) {
            accounts.put(i, initialBalance);
        }
    }

    public void deposit(int accountNumber, int amount) {
        lock.lock();
        try {
            int balance = accounts.getOrDefault(accountNumber, 0);
            accounts.put(accountNumber, balance + amount);
            System.out.println("Deposited " + amount + " into account " + accountNumber +
                    ". New balance: " + accounts.get(accountNumber));
        } finally {
            lock.unlock();
        }
    }

    public void withdraw(int accountNumber, int amount) {
        lock.lock();
        try {
            int balance = accounts.getOrDefault(accountNumber, 0);
            if (balance >= amount) {
                accounts.put(accountNumber, balance - amount);
                System.out.println("Withdrew " + amount + " from account " + accountNumber +
                        ". New balance: " + accounts.get(accountNumber));
            } else {
                System.out.println("Insufficient funds in account " + accountNumber);
            }
        } finally {
            lock.unlock();
        }
    }

    public int getBalance(int accountNumber) {
        lock.lock();
        try {
            return accounts.getOrDefault(accountNumber, 0);
        } finally {
            lock.unlock();
        }
    }
}

// Customer class
class Customer extends Thread {
    private final Bank bank;
    private final int accountNumber;

    public Customer(Bank bank, int accountNumber) {
        this.bank = bank;
        this.accountNumber = accountNumber;
    }

    @Override
    public void run() {
        bank.deposit(accountNumber, 100);
        bank.withdraw(accountNumber, 50);
        bank.deposit(accountNumber, 200);
        bank.withdraw(accountNumber, 150);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        int numAccounts = 5;
        int initialBalance = 1000;

        Bank bank = new Bank(numAccounts, initialBalance);

        // Simulating multiple customers
        Thread[] customers = new Thread[5];
        for (int i = 0; i < 5; i++) {
            customers[i] = new Customer(bank, i + 1);
        }

        for (Thread customer : customers) {
            customer.start();
        }

        for (Thread customer : customers) {
            try {
                customer.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Display final balances
        System.out.println("\nFinal account balances:");
        for (int i = 1; i <= numAccounts; i++) {
            System.out.println("Account " + i + ": " + bank.getBalance(i));
        }
    }
}

