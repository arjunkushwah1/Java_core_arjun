package file_io.Q3;

import java.io.File;

public class FileCheck
{
    public static void main(String[] args) {
        String fileName = "report.pdf";
        File file = new File(fileName);

        if (file.exists() && file.isFile()) {
            System.out.println("File found: " + fileName);
            System.out.println("File size: " + file.length() + " bytes");
        } else {
            System.out.println("File " + fileName + " does not exist in the current directory.");
        }
    }
}
