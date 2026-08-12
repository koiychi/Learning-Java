/*
IT 203 - Object-Oriented Programming
Rodriguez, Miles
BSIT 2H-G1

Activity 6 - Abstraction and Interfaces
*/

//Option 1: Music

public class Dancer implements Performable, Maintainable {
    private String stageName;

    public Dancer(String stageName) {
        setStageName(stageName);
    }

    @Override
    public boolean needsStage() {
        return true;
    }

    @Override
    public void perform() {
        System.out.println("Sumasayaw si " + stageName + " ng Galaw Pilipinas.");
    }

    public String getMaintenanceSchedule() {
        return "Maintenance Schedule: ";
    }

    public void setStageName(String stageName) {
        if (stageName == null || stageName.isBlank()) {
            throw new IllegalArgumentException("Stage name cannot be blank or null");
        }
        this.stageName = stageName;
    }
}
