package multithreading_assignments.Q3_odd_even_printer;


class SharedPrinter
{
    private int num=1;
    private final int max=100;

    public synchronized void oddPrint() throws Exception
    {
        while(num<=max)
        {
            if(num%2==0)
            {
                wait();
            }
            else
            {
                System.out.print(num+" ");
                num++;
                notify();
            }
        }
    }
    public synchronized void evenPrint() throws Exception
    {
        while(num<=max)
        {
            if(num%2!=0)
            {
                wait();
            }
            else
            {
                System.out.print(num+" ");
                num++;
                notify();
            }
        }
    }
}


public class Main
{
    public static void main(String[] args)
    {
        SharedPrinter s=new SharedPrinter();

        Thread t1 = new Thread(() -> {
            try {
                s.oddPrint();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                s.evenPrint();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        t1.start();
        t2.start();
    }
}
