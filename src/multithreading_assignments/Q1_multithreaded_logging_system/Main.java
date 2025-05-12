package multithreading_assignments.Q1_multithreaded_logging_system;

public class Main
{
    public static void main(String[] args) {
        Logger logger = new Logger();

        // Start 10 (0) threads each logging 10(0) messages
        for (int i = 1; i <= 10; i++) {
            Thread t = new Thread(new LogProducer(logger, i));
            t.start();
        }

        // Give time for all threads to finish
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        logger.shutdown();


    }
}
