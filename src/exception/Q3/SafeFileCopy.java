package exception.Q3;
import java.io.*;
public class SafeFileCopy {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("File copied successfully.");
        }
        catch (IOException e) {
            System.out.println("An error occurred during file processing.");
            e.printStackTrace();
        }
    }
}
