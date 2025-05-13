package file_io.Q8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvupperCase
{
    public static void main(String[] args) {
        String fileName = "employees.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line.toUpperCase());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the CSV file.");
            e.printStackTrace();
        }
    }
}
