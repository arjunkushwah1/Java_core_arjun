package file_io.hands_on_io;

import java.io.*;

public class LogFileAnalyzer
{
    public static void main(String[] args)
    {
        // Set default input and output file names
        String inputFile = "server.log";
        String outputFile = "summary.txt";

        if (args.length >= 2) {
            inputFile = args[0];
            outputFile = args[1];
        }

        int totalLines = 0;
        int errorCount = 0;
        int warningCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) //file &try with resources
        {
            String line;

                while ((line = reader.readLine()) != null) {
                totalLines++;
                if (line.contains("ERROR")) {
                    errorCount++;
                }
                if (line.contains("WARNING")) {
                    warningCount++;
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Input file not found: " + inputFile);
            return;
        } catch (IOException e) {
            System.out.println("Error while reading the file: " + inputFile);
            e.printStackTrace();
            return;
        }

        double errorPercent = totalLines > 0 ? (errorCount * 100.0 / totalLines) : 0;
        double warningPercent = totalLines > 0 ? (warningCount * 100.0 / totalLines) : 0;


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write("Log Summary Report");
            writer.newLine();
            writer.write("------------------");
            writer.newLine();
            writer.write("Total log entries: " + totalLines);
            writer.newLine();
            writer.write("ERROR entries: " + errorCount + String.format(" (%.2f%%)", errorPercent));
            writer.newLine();
            writer.write("WARNING entries: " + warningCount + String.format(" (%.2f%%)", warningPercent));
            writer.newLine();

            System.out.println("Log summary written to: " + outputFile);

        } catch (IOException e) {
            System.out.println("Error while writing to file: " + outputFile);
            e.printStackTrace();
        }

    }
}
