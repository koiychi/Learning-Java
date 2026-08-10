/*
IT 203 - Object-Oriented Programming
Rodriguez, Miles J.
BSIT 2H-G1

Activity 5 - Polymorphism
*/

public class Tea extends Beverage {
    private int steepMinutes;

    public Tea(String name, int sizeOunces, int steepMinutes) {
        super(name, sizeOunces);
        setSteepMinutes(steepMinutes);
    }

    public void setSteepMinutes(int steepMinutes) {
        if (steepMinutes <= 0) {
            throw new IllegalArgumentException("Steep time must be positive. Got " + steepMinutes);
        } 
        this.steepMinutes = steepMinutes;
    }

    public int getSteepMinutes() {
        return steepMinutes;
    }

    @Override
    public String toString() {
        return super.toString() + " | Steeped: " + steepMinutes + " min";
    }
}
