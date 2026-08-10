/*
IT 203 - Object-Oriented Programming
Rodriguez, Miles J.
BSIT 2H-G1

Activity 3 - Inheritance
*/

public class Appliance {
    private String brand;
    private String modelNumber;
    private int powerWatts;
    private boolean isOn = false;


    public void turnOn() {
        if(isOn == false) {
            this.isOn = true;
            System.out.println("[INFO] Turned On");
        } else {
            throw new IllegalArgumentException("[INFO] Already On, turn off first then on again. :>");
        }
    }

    public void turnOff() {
        if(isOn == true) {
            this.isOn = false;
            System.out.println("[INFO] Turned Off");

        } else {
            throw new IllegalArgumentException("[INFO] Already Off, turn on first then off again. :>");
        }
    }

    //GETTERS
    public String getBrand() {
        return brand;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public int getPowerWatts() {
        return powerWatts;
    }

    public boolean isOn() {
        return isOn;
    }

    //SETTERS FOR CONSTRUCTORS
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public void setPowerWatts(int powerWatts) {
        if (powerWatts<0) {
            throw new IllegalArgumentException("[ERROR] Power Watts cannot be negative and must be greater than 0");
        } else {
            this.powerWatts = powerWatts;
        }
    }

    //CONSTRUCTORS

    public Appliance() {
        this("Unknown Brand", "Unknown Model", 5);
    }

    public Appliance(String brand, String modelNumber, int powerWatts) {
        setBrand(brand);
        setModelNumber(modelNumber);
        setPowerWatts(powerWatts);
    }

    public String getStatusReport() {
        return "Summary: \n\tBrand: " + getBrand() + "\n\tModel Number: " + getModelNumber() +  "\n\tPower Watts: " + getPowerWatts() + "W" +  "\n\tis On?: " + isOn();
    }
}
