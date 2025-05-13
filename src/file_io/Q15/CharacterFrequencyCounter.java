package file_io.Q15;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterFrequencyCounter
{
    public static void main(String[] args) {
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");

        Map<Character, Integer> map = new LinkedHashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            int ch;
            while ((ch = reader.read()) != -1) {
                char c = (char) ch;
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        } catch (FileNotFoundException e) {
            System.out.println("input.txt not found ");
        } catch (IOException e) {
            System.out.println("an error occurred while reading the file.");
            e.printStackTrace();
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile)))
        {
            for(Map.Entry<  Character,Integer>entry : map.entrySet())
            {
                char c = entry.getKey();
                int count = entry.getValue();
                writer.write("'"+c+"' : "+count);
                writer.newLine();
            }
            System.out.println("character frequiencies written to charcount.txt");
        }
        catch(IOException e)
        {
            System.out.println("an error occurred while writing to charcount.txt.");
            e.printStackTrace();
        }
    }
}
