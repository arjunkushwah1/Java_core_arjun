package multithreading_assignments.Q1_multithreaded_logging_system;

import java.time.LocalDateTime;
import java.util.concurrent.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Logger
{
    private final BlockingQueue<String> logQueue=new LinkedBlockingQueue<>();
    private volatile boolean running = true;
    private final Thread logThread;

    public Logger()
    {
        logThread= new Thread(() -> {

            while (running || !logQueue.isEmpty())
            {
                try
                {
                    Thread.sleep(5000);
                    flushLogs();
                }
                catch (InterruptedException e)
                {
                    Thread.currentThread().interrupt();
                }
            }
        });
        logThread.start();
    }
    public void log(String message)
    {
        String timestamped = "["+ LocalDateTime.now() +"] "+message ;
        logQueue.offer(timestamped);
    }

    public void flushLogs() {
        String msg;
        while ((msg = logQueue.poll()) != null)
        {
            System.out.println(msg);
        }
    }
    public void shutdown()
    {
        running = false;
        logThread.interrupt();
        try
        {
            logThread.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
