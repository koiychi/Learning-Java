/*
IT 203 - Object-Oriented Programming
Rodriguez, Miles J.
BSIT 2H-G1

Activity 5 - Polymorphism
*/

class Robot {
    String label = "Generic Robot";

    @Override
    public String toString() {
        return "Robot: " + label;
    }
}

class CleaningRobot extends Robot {
    String label = "Cleaning Robot"; //shadows, does not override

    @Override
    public String toString() {
        return "CleaningRobot: " + label;
    }
}
