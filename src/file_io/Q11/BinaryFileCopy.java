package file_io.Q11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileCopy
{
    public static void main(String[] args) {
        String sourceFile = "src/file_io/Q11/image.jpg";
        String destFile = "src/file_io/Q11/image_copy.jpg";

        try (
                FileInputStream inputStream = new FileInputStream(sourceFile);
                FileOutputStream outputStream = new FileOutputStream(destFile)
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("Binary file copied successfully to " + destFile);
        } catch (IOException e) {
            System.out.println("An error occurred while copying the binary file.");
            e.printStackTrace();
        }
    }
}
