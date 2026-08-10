/*
IT 203 - Object-Oriented Programming
Rodriguez, Miles J.
BSIT 2H-G1

Activity 3 - Inheritance
*/

public class Refrigerator extends Appliance {


    private double temperatureCelsius; //-5 to 10 only

    //SETTER
    public void setTemperatureCelsius(double tempCels) {
        if (tempCels >= -5 || tempCels <= 10) {
            this.temperatureCelsius = tempCels;
        } else {
            throw new IllegalArgumentException("[ERROR] Temperature must be between -5°C and 10°C only. :<");
        }
    }

    //GETTER
    public double getTemperatureCelsius() {
        return temperatureCelsius;
    }
    
    //CONSTRUCTORS
    public Refrigerator() {
        this("Unknown", "Unknown", 5, 0);
    }

    public Refrigerator(String brand, String modelNumber, int powerWatts, double temperatureCelsius) {
        super(brand, modelNumber, powerWatts);
        this.temperatureCelsius = temperatureCelsius;
    }


    //Get Status Report Method

    @Override
    public String getStatusReport() {
        return super.getStatusReport() + "\n\tTemperature: " + getTemperatureCelsius();
    }
}
