package multithreading_assignments.Q2_Bank_Account_Synchronization;

import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private double balance;
    private final ReentrantLock lock = new ReentrantLock();
    private final String accountId;

    public BankAccount(String accountId, double initialBalance) {
        this.accountId = accountId;
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        lock.lock();
        try {
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " deposited " + amount + " to " + accountId);
        } finally {
            lock.unlock();
        }
    }
    public void withdraw(double amount) {
        lock.lock();
        try {
            if (amount <= balance) {
                balance -= amount;
                System.out.println(Thread.currentThread().getName() + " withdrew " + amount + " from " + accountId);
            } else {
                System.out.println(Thread.currentThread().getName() + " attempted to withdraw " + amount + ", but insufficient funds in " + accountId);
            }
        } finally {
            lock.unlock();
        }
    }
    public double getBalance() {
        return balance;
    }

    public String getAccountId() {
        return accountId;
    }
}



