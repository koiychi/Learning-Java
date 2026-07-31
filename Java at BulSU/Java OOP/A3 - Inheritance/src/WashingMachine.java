/*
IT 203 - Object-Oriented Programming
Rodriguez, Miles J.
BSIT 2H-G1

Activity 3 - Inheritance
*/

public class WashingMachine extends Appliance{
    private int maxSpinRpm;
    private String currentCycle = "idle";

    //SETTERS
    public void startCycle(String cycle) {
        if (cycle.isBlank()) {
            throw new IllegalArgumentException("[ERROR] Cycle name cannot be blank. :<");
        }
        this.currentCycle = cycle;
    }

    public void setMaxSpinRpm(int maxSpinRpm) {
        if (maxSpinRpm >= 0) {
            this.maxSpinRpm = maxSpinRpm;
        } else {
            throw new IllegalArgumentException("[ERROR] Max Spin (RPM) cannot be negative.");
        }
    }

    //GETTERS
    public String getCurrentCycle() {
        return currentCycle;
    }

    public double getMaxSpinRpm() {
        return maxSpinRpm;
    }


    //CONSTRUCTORS

    public WashingMachine() {
        this("Unknown", "Unknown", 5, "idle", 0);
    }

    public WashingMachine(String brand, String modelNumber, int powerWatts, String currentCycle, int maxSpinRpm) {
        super(brand, modelNumber, powerWatts);
        startCycle(currentCycle); 
        setMaxSpinRpm(maxSpinRpm);
    }

    @Override
    public String getStatusReport() {
        return super.getStatusReport() + "\n\tCurrent Cycle: " + getCurrentCycle() + "\n\tMax Spin: " + getMaxSpinRpm() + " RPM";
    }

    
}
