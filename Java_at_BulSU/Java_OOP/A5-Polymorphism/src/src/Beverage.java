/*
IT 203 - Object-Oriented Programming
Rodriguez, Miles J.
BSIT 2H-G1

Activity 5 - Polymorphism
*/

//COFFEE SHOP (BEVERAGE)

public class Beverage {
    private String name;
    private int sizeOunces;
    private boolean isServed;

    public Beverage (String name, int sizeOunces) {
        setName(name);
        setSizeOunces(sizeOunces);
        this.isServed = false;
    }

    public void setName (String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be blank.");
        }
        this.name = name;
    }

    public void setSizeOunces (int sizeOunces) {
        if (sizeOunces <= 0) {
            throw new IllegalArgumentException("Size must be positive. Got: "+ sizeOunces);
        }
        this.sizeOunces = sizeOunces;
    }

    public String getName() { return name; }
    public int getSizeOunces() { return sizeOunces; }
    public boolean isServed() { return isServed; }
    public void serve() { isServed = true; }

    @Override
    public String toString() {
        return name + " (" + sizeOunces + "oz) - " + (isServed ? "Served" : "Not yet served");
    }
}
