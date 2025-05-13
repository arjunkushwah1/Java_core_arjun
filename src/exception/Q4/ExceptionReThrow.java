package exception.Q4;
import java.io.*;
class DataLoadException extends Exception {
    public DataLoadException(String message, Throwable cause) {
        super(message, cause);
    }
}
public class ExceptionReThrow {
    public static void loadDataFromFile(String fileName) throws DataLoadException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();
            System.out.println("Read: " + line);
            reader.close();
        }
        catch (IOException e) {
            throw new DataLoadException("Failed to load data from file: " + fileName, e);
        }
    }
    public static void main(String[] args) {
        try {
            loadDataFromFile("missing.txt");  // Try with a non-existent file
        } catch (DataLoadException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
            e.printStackTrace();  // This shows original IOException too!
        }
    }
}