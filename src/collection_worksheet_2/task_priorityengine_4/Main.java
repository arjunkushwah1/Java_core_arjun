package collection_worksheet_2.task_priorityengine_4;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main
{
    public static void main(String[] args)
    {
        TaskScheduler scheduler = new TaskScheduler();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Task task1 = new Task("Submit Report", 3, sdf.parse("2025-05-03"));
            Task task2 = new Task("Email Client", 2, sdf.parse("2025-05-01"));
            Task task3 = new Task("Code Review", 1, sdf.parse("2025-10-01"));
            Task task4 = new Task("Team Meeting", 5, sdf.parse("2025-05-04"));
            Task task5 = new Task("Plan Presentation", 4, sdf.parse("2025-03-02"));

            scheduler.addTask(task1);
            scheduler.addTask(task2);
            scheduler.addTask(task3);
            scheduler.addTask(task4);
            scheduler.addTask(task5);

            // Execute tasks in priority order
            scheduler.executeTasks();

        } catch (ParseException e) {
            System.out.println("Invalid date format. Use yyyy-MM-dd.");
            e.printStackTrace();
        }
    }
}
