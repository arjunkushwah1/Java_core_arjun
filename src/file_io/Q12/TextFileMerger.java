package file_io.Q12;

import java.io.*;

public class TextFileMerger
{
    public static void main(String[] args) {
        File folder = new File("texts");
        File mergedFile = new File("merged.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(mergedFile))) {
            File[] files = folder.listFiles((dir, name) -> name.endsWith(".txt"));

            if (files == null || files.length == 0) {
                System.out.println("No .txt files found in the folder.");
                return;
            }

            for (File file : files) {
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    String line;
                    writer.write("=== " + file.getName() + " ===");
                    writer.newLine();
                    while ((line = reader.readLine()) != null) {
                        writer.write(line);
                        writer.newLine();
                    }
                    writer.newLine();
                }
            }

            System.out.println("All .txt files merged into " + mergedFile.getName());
        } catch (IOException e) {
            System.out.println("An error occurred while merging files.");
            e.printStackTrace();
        }
    }
}
