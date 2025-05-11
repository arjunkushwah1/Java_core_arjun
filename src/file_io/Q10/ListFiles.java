package file_io.Q10;

import java.io.File;

public class ListFiles
{
    public static void main(String[] args) {
        String folderName = "out";
        File folder = new File(folderName);

        if (folder.exists() && folder.isDirectory()) {
            String[] fileList = folder.list();

            if (fileList != null && fileList.length > 0) {
                System.out.println("Files and directories in " + folderName + ":");
                for (String fileName : fileList) {
                    System.out.println(fileName);
                }
            } else {
                System.out.println("No files or directories found in " + folderName);
            }
        } else {
            System.out.println(folderName + " is not a valid directory or does not exist.");
        }
    }
}
