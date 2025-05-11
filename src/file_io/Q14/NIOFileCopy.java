package file_io.Q14;

import java.io.IOException;
import java.nio.file.*;

public class NIOFileCopy
{
    public static void main(String[] args) {
        Path sourcePath = Paths.get("source.txt");
        Path destinationPath = Paths.get("destination.txt");
        try {
            String content = Files.readString(sourcePath);
            Files.writeString(destinationPath, content, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

            System.out.println("File copied successfully using NIO.");
        } catch (NoSuchFileException e) {
            System.out.println("Source file not found: " + sourcePath);
        } catch (IOException e) {
            System.out.println("An error occurred during file read/write.");
            e.printStackTrace();
        }
    }
}
