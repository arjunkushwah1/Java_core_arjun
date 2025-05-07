package multithreading_assignments.Q4_thread_pool_image_processor;

import java.util.concurrent.Callable;

public class ImageProcessor implements Callable<String> {
    private int imageId;

    public ImageProcessor(int imageId) {
        this.imageId = imageId;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000); // Simulate image processing
        return "Image " + imageId + " processed";
    }
}