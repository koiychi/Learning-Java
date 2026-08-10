/*
IT 203 - Object-Oriented Programming
Rodriguez, Miles J.
BSIT 2H-G1

Activity 5 - Polymorphism
*/

public class Coffee extends Beverage {
    private int shotsOfEspresso;

    public Coffee (String name, int sizeOunces, int shotsOfEspresso) {
        super(name, sizeOunces);
        setShotsOfEspresso(shotsOfEspresso);
    }

    public void setShotsOfEspresso(int shotsOfEspresso) {
        if (shotsOfEspresso <= 0) {
            throw new IllegalArgumentException("Shots of espresso must be positive. Got: " + shotsOfEspresso);
        } 
        this.shotsOfEspresso = shotsOfEspresso;
    }

    public int getShotsOfEspresso() {
        return shotsOfEspresso;
    }

    @Override
    public String toString() {
        return super.toString() + " | Espresso shots: " + shotsOfEspresso;
    }

}
