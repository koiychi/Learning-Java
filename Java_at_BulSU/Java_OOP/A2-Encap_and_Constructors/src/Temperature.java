/*
IT 203 - Object-Oriented Programming
Rodriguez, Miles J.
BSIT 2H-G1

Activity 2 - Encapsulation and Constructors
*/

public final class Temperature {
    private final double degreesCelsius;

    public Temperature(double degreesCelsius) {
        if (degreesCelsius < -273.15) {
            throw new IllegalArgumentException("[WARNING] Temperature cannot be below absolute zero (-273.15 °C)");
        }
        this.degreesCelsius = degreesCelsius;
    }

    public double getDegreesCelsius() {
        return degreesCelsius;
    }

    public Temperature plus(double amount) {
        return new Temperature(this.degreesCelsius + amount);
    }
}