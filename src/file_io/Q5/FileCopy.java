package file_io.Q5;

import java.io.*;

public class FileCopy
{
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destFile = "backup.txt";

        try (
                BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(destFile))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Contents copied from " + sourceFile + " to " + destFile);
        } catch (IOException e) {
            System.out.println("An error occurred during file copy.");
            e.printStackTrace();
        }
    }
}
