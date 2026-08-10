public class Dancer implements Performable, Maintainable {
    private String stageName;

    public Dancer(String stageName) {
        setStageName(stageName);
    }

    @Override
    public boolean needsStage() {
        return true;
    }

    public void perform() {
        System.out.println("Sumasayaw si " + stageName + " ng Galaw Pilipinas.");
    }

    public String getMaintenanceSchedule() {
        return "Maintenance Schedule: ";
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }
}
