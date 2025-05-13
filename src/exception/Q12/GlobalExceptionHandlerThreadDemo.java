package exception.Q12;
public class GlobalExceptionHandlerThreadDemo{
    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler((thread,exception)->{
            System.out.println("global handler caught exception from thread: "+ thread.getName());
            System.out.println("exception message: "+exception.getMessage());
        });
        Thread t1=new ErrorProneThread("worker-1");
        Thread t2=new ErrorProneThread("worker-2");
        t1.start();
        t2.start();
        System.out.println("main thread done.");
    }
}
