package exception.Q1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
class  DataProcessingException extends Exception
{
    public DataProcessingException(String message, Throwable cause)
    {
        super(message,cause);
    }
}
public class Main
{
    public static void readData() throws  IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader("data.sgvd"));
        String line=reader.readLine();
        reader.close();
        System.out.println("data read : "+ line);
    }
    public static void  processData() throws DataProcessingException
    {
        try
        {
            readData();
        }
        catch (IOException e)
        {
            throw new DataProcessingException("faild to dataprocess" ,e);
        }
    }
    public static void main(String[] args)
    {
        try
        {
            processData();
        }
        catch (DataProcessingException e)
        {
            System.out.println( " data processing faild : "+e.getMessage());
            e.printStackTrace();
        }
    }
}
