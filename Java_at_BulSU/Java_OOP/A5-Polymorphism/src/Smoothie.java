/*
IT 203 - Object-Oriented Programming
Rodriguez, Miles J.
BSIT 2H-G1

Activity 5 - Polymorphism
*/

public class Smoothie extends Beverage {
    private int numFruits;

    public Smoothie(String name, int sizeOunces, int numFruits) {
        super(name, sizeOunces);
        setNumFruits(numFruits);
    }

    public void setNumFruits(int numFruits) {
        if (numFruits <= 0) {
            throw new IllegalArgumentException("Number of fruits must be positive.");
        }
        this.numFruits = numFruits;
    }

    public int getNumFruits() {
        return numFruits;
    }

    @Override
    public String toString() {
        return super.toString() + " | Number of fruits: " + getNumFruits();
    }
}
