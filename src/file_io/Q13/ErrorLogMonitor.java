package file_io.Q13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ErrorLogMonitor
{
    public static void main(String[] args) {
        File logFile = new File("server.log");

        if (!logFile.exists()) {
            System.out.println("server.log does not exist.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(logFile))) {
            String line;
            System.out.println("Scanning for lines with 'ERROR':\n");

            while ((line = reader.readLine()) != null) {
                if (line.contains("ERROR")) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the log file.");
            e.printStackTrace();
        }
    }
}
