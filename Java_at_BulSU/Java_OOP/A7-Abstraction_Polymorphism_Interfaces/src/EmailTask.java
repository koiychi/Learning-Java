public class EmailTask extends Task implements Cancellable {
    private String recipient;
    private String taskName;

    public EmailTask (String taskName, String recipient) {
        super(taskName);
        this.recipient = recipient;
    }

    @Override
    public void execute() {
        System.out.println("Sending email to " + recipient + ": " + getTaskName());
    }

    public void cancel() {
        System.out.println("Task Cancelled");
    }


}
