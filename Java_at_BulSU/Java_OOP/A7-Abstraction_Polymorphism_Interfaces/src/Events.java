public class Events implements Cancellable, Describable {
    private String eventName;

    public String getEventName() {
        return eventName;
    }

    public void cancel() {
        System.out.println("Cancelling event.");
    }

    public String describe() {
        return "Event: " + getEventName();
    }
}
