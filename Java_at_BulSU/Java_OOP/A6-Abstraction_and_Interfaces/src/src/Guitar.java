/*
IT 203 - Object-Oriented Programming
Rodriguez, Miles
BSIT 2H-G1

Activity 6 - Abstraction and Interfaces
*/

//Option 1: Music

public class Guitar extends Instrument implements FeaturedAct {
    private int numStrings;

    //CONSTRUCTOR
    public Guitar(String name, int numStrings) {
        super(name);
        setNumStrings(numStrings);
    }

    public Guitar() {
        this("Guitar Player", 6);
    }

    public void setNumStrings(int numStrings) {
        if (numStrings <= 0) {
            throw new IllegalArgumentException("Number of strings cannot be zero or negative.");
        } this.numStrings = numStrings;
    }

    @Override
    public String toString() {
        return "Sound of Guitar: " + produceSound();
    }
    
    //INHERITED METHODS
    @Override
    public String produceSound() {
        return "Kring kring (strumming)";
    }

    //From FeaturedAct
    @Override
    public String getBillingName() {
        return "Billing";
    }

    //From Performable interface
    @Override
    public boolean needsStage(){
        return true;
    }

    @Override
    public void perform() {
        System.out.println("Tumutugtog si " + getName() + " ng guitar niya na may " + numStrings + " strings. Amazing!");
    }

    //From Maintainable interface
    @Override
    public String getMaintenanceSchedule() {
        return "Performance schedule";
    }
    

    


}
