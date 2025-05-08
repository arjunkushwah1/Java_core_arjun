package Java_Functional_Programming_exercises.real_life_mini_challenges_Q51to55.Q55;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Job {
    private String name;
    private String status;

    public Job(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }
}
public class BatchJobProcessor
{
    public static List<String> getFailedJobNames(List<Job> jobs) {
        return jobs.stream()
                .filter(job -> "FAILED".equalsIgnoreCase(job.getStatus()))
                .map(job -> job.getName().toUpperCase())
                .sorted()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("DataImport", "SUCCESS"),
                new Job("UserSync", "FAILED"),
                new Job("LogCleanup", "FAILED"),
                new Job("EmailDispatch", "SUCCESS"),
                new Job("AnalyticsRun", "FAILED")
        );

        List<String> failedJobs = getFailedJobNames(jobs);
        System.out.println("Failed jobs: " + failedJobs);
    }
}
