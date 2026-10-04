public abstract class Task {
    private String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskName() { return taskName; }

    public abstract void execute();

    @Override
    public String toString() {
        return "Task: " + taskName;
    }
}
