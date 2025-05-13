package exception.Q11;

class MyThread extends Thread {
   @Override
    public void run() {
       System.out.println("Thread started: "+getName());
       throw new RuntimeException("intentional failure in "+getName());
   }
}
public class ThreadExceptionWithClass {
    public static void main(String[] args) {
        MyThread thread= new MyThread();

        thread.setUncaughtExceptionHandler((t,e) -> {
            System.out.println("exception caught from thread: "+t.getName());
            System.out.println("error message: "+e.getMessage());
        });

        thread.start();
        System.out.println("main thread done");
    }
}
