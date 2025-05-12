package multithreading_assignments.Q2_Bank_Account_Synchronization;

public class BankSimulator {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("A123", 1000);
        TransactionLogger logger = new TransactionLogger();
        Thread loggerThread = new Thread(logger);
        loggerThread.start();

        Thread[] userThreads = new Thread[10];

        for (int i = 0; i < 5; i++) {
            userThreads[i] = new Thread(() -> {
                account.deposit(200);
                logger.log(new Transaction("Deposit", 200, account.getAccountId()));
            }, "Depositor-" + i);
        }

        for (int i = 5; i < 10; i++) {
            userThreads[i] = new Thread(() -> {
                account.withdraw(150);
                logger.log(new Transaction("Withdraw", 150, account.getAccountId()));
            }, "Withdrawer-" + i);
        }

        for (Thread t : userThreads) {
            t.start();
        }

        for (Thread t : userThreads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        logger.stop();
        try {
            loggerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Balance: " + account.getBalance());
    }
}
