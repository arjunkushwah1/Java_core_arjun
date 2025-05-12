package Java_Functional_Programming_exercises.basics_Q1to7.Q7_Runnable;

public class Main implements Runnable
{
    @Override
    public void run() {
        System.out.println("hello functional java");
    }

    public static void main(String[] args)
    {
        Main obj=new Main();
        obj.run();

    }
}
