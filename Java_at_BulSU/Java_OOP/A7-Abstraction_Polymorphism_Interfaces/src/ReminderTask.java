public class ReminderTask extends Task {
    private String remindAt;
    private String taskName;

    //CONSTRUCTORS
    public ReminderTask (String taskName, String remindAt) {
        super(taskName);
        this.remindAt = remindAt;
    }

    public ReminderTask() {
        this("Task", "Anytime Available");
    }

    //GETTERS
    public String getRemindAt() {
        return remindAt;
    }

    @Override
    public void execute() {
        System.out.println("Reminding " + getTaskName() + " at " + getRemindAt());
    }
}
