package multithreading_assignments.Q4_thread_pool_image_processor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(5); // Fixed thread pool of size 5

        List<Future<String>> futures = new ArrayList<>();

        long startTime = System.currentTimeMillis();

        for (int i = 1; i <= 50; i++) {
            ImageProcessor task = new ImageProcessor(i);
            Future<String> future = executor.submit(task);
            futures.add(future);
        }

        for (Future<String> future : futures) {
            System.out.println(future.get()); //in-order
        }

        executor.shutdown();

        long endTime = System.currentTimeMillis(); // End timer
        System.out.println("Total time taken: " + (endTime - startTime) + " ms");
    }
}
