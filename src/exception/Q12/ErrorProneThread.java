package exception.Q12;

public class ErrorProneThread extends Thread
{
    public ErrorProneThread(String name)
    {
        super(name);
    }
    @Override
    public void run()
    {
        System.out.println("thread "+getName() +" started.");
        throw new RuntimeException("something went wrong in "+getName());
    }
}
