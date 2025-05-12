package multithreading_assignments.Q1_multithreaded_logging_system;

public class LogProducer implements Runnable
{
    private final Logger logger;
    private final int id;

    public LogProducer(Logger logger,int id)
    {
        this.logger = logger;
        this.id = id;
    }

    @Override
    public void  run()
    {
        for(int i=1;i<=10;i++)
        {
            logger.log("thread-"+id+" messsage-"+i);
        }
    }

}
