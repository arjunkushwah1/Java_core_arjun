package file_io.Q2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead
{
    public static void main(String[] args) {
        String fileName = "src/file_io/Q2/input.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            System.out.println("Contents of input.txt:");
            while ((line = reader.readLine()) != null)
            {
                System.out.println(line);
            }
            reader.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
