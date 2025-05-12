package multithreading_assignments.Q2_Bank_Account_Synchronization;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TransactionLogger implements Runnable {
    private final BlockingQueue<Transaction> logQueue = new LinkedBlockingQueue<>();
    private volatile boolean running = true;

    public void log(Transaction transaction) {
        logQueue.offer(transaction);
    }

    public void stop() {
        running = false;
    }

    @Override
    public void run() {
        while (running || !logQueue.isEmpty()) {
            try {
                Transaction txn = logQueue.take();
                System.out.println("LOG: " + txn);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}