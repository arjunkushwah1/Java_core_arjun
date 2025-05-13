package collection_worksheet_2.task_priorityengine_4;

import java.util.Date;

public class Task
{
    private String name;
    private int priority;
    private Date deadline;

    public Task(String name, int priority, Date deadline) {
        this.name = name;
        this.priority = priority;
        this.deadline = deadline;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public Date getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                ", deadline=" + deadline +
                '}';
    }
}
