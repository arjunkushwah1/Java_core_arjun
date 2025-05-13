package file_io.Q9;

import java.io.File;

public class FileDelete
{
    public static void main(String[] args) {
        String filename="oldfile.txt";
        File file=new File(filename);
        if(file.exists())
        {
            if(file.delete())
            {
                System.out.println(filename+" has been deleted.");
            }
            else
            {
                System.out.println("failed to delete "+filename);
            }
        }
        else
        {
            System.out.println(filename+" does not exist.");
        }

    }
}
