package exception.Q6;
class FileValidationException extends Exception { // handling for checked exception
    public FileValidationException(String message) {
        super(message);
    }
}
class CriticalSystemException extends RuntimeException {// handling for unchecked exception
    public CriticalSystemException(String message) {
        super(message);
    }
}
public class ExceptionType {

    public static void main(String[] args) {
        try {
            validateFile("data.txt");
        }
        catch (FileValidationException e) {
            System.out.println("Recoverable error: " + e.getMessage());

        }
        try {
            checkSystemHealth(false);// case of runtime exception, simulate system failure
        }
        catch (CriticalSystemException e) {
            System.out.println(" critical failure : "+e.getMessage());
            System.exit(1);
        }
    }
    public static void validateFile(String filename) throws FileValidationException { //throw checked exception
        if (!filename.endsWith(".txt")) {
            throw new FileValidationException("Invalid file format. Only .txt allowed.");
        }
        System.out.println("File validated successfully.");
    }
    public static void checkSystemHealth(boolean healthy) { //throw unchecked exception
        if (!healthy) {
            throw new CriticalSystemException("System configuration corrupted!");
        }
        System.out.println("System is healthy.");
    }
}
