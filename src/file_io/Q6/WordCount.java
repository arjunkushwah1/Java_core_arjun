package file_io.Q6;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class WordCount
{
    public static void main(String[] args) {
        String fileName = "paragraph.txt";
        int javaCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equalsIgnoreCase("Java")) {
                        javaCount++;
                    }
                }
            }

            System.out.println("The word \"Java\" appears " + javaCount + " times.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
