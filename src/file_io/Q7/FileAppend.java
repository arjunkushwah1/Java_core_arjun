package file_io.Q7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class FileAppend
{
    public static void main(String[] args) {
        String fileName = "log.txt";
        LocalDate currentDate = LocalDate.now();
        String lineToAppend = "Last updated on " + currentDate;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.newLine();
            writer.write(lineToAppend);
            System.out.println("Line appended to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file.");
            e.printStackTrace();
        }
    }
}
