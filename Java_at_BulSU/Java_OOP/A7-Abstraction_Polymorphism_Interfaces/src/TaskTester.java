public class TaskTester {
    public static void main(String[] Koi) {
        Task[] tasks = {
                new EmailTask("Email to Miles", "miles@email.com"),
                new ReminderTask("Send Email to Miles", "Sat, Sep 26 | 9 AM"),
//                new ReminderTask()
        };

        //Showing only the subclass EmailTask
        for (Task listTasks : tasks) {
            if (listTasks instanceof EmailTask) {
                listTasks.execute();
            }
        }
    }
}
