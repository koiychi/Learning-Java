public class Dancer implements Performable, Maintainable {
    private String stageName;

    public boolean needsStage() {
        return false;
    }

    public void perform() {

    }

    public String getMaintenanceSchedule() {
        return "Maintenance Schedule: ";
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }
}
