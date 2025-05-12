package collection_worksheet_2.Q4_task_priorityengine;

import java.util.Comparator;
import java.util.PriorityQueue;

public class TaskScheduler
{
    private PriorityQueue<Task> taskq;
    public TaskScheduler()
    {
        taskq=new PriorityQueue<>(new Comparator<Task>() {
            @Override
            public int compare(Task t1, Task t2) {
                int deadlineCompare= t1.getDeadline().compareTo(t2.getDeadline());
                if(deadlineCompare != 0)
                {
                    return deadlineCompare;
                }
                return Integer.compare(t1.getPriority(), t2.getPriority());
            }
        });
    }
    public void addTask(Task task) {
        taskq.add(task);
    }

    public void executeTasks() {
        while (!taskq.isEmpty()) {
            System.out.println("Executing: " + taskq.poll());
        }
    }
}
