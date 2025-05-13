package exception.Q8;
import java.io.IOException;
class ServiceUnavailableException extends Exception {
    public  ServiceUnavailableException(String message) {
        super(message);
    }
}
class FlakyService {
    public static String fetchData() throws IOException {
        if(Math.random()<0.7) {
            throw  new IOException("service failed");
        }
        return "successful data!";
    }
}
public class RetryHandler {
    public  static  String fetchWithRetry(int maxAttempts) throws ServiceUnavailableException {
        int attempts=0;
        while (attempts<maxAttempts) {
            try {
                return FlakyService.fetchData();
            }
            catch(IOException e) {
                attempts++;
                System.out.println("attempts "+attempts + " failed: "+e.getMessage());
                if(attempts>=maxAttempts) {
                    throw new ServiceUnavailableException("service unavailable after "+ 3 +" attempts.");
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        try {
            String result = fetchWithRetry(3);
            System.out.println("service result: " + result);
        } catch (ServiceUnavailableException e) {
            System.err.println("ERROR: " + e.getMessage());
        }
    }
}
