/*
IT 203 - Object-Oriented Programming
Rodriguez, Miles
BSIT 2H-G1

Activity 6 - Abstraction and Interfaces
*/

//Option 1: Music

public class Piano extends Instrument implements Performable {
    private int numKeys;

    //CONSTRUCTOR
    public Piano(String name, int numKeys) {
        super(name);
        setNumKeys(numKeys);
    }

    public Piano() {
        this("Piano Player", 24);
    }

    public void setNumKeys(int numKeys) {
        if (numKeys <= 0) {
            throw new IllegalArgumentException("A piano cannot have 0 or negative number of keys. :<");
        }
        this.numKeys = numKeys;
    }

    @Override
    public String toString() {
        return "Sound of Piano: " + produceSound();
    }

    //Inherited from Instrument
    @Override
    public String produceSound() {
        return "dan, dan, danan (piano playing)";
    }

    // //No @Override
    // public boolean needsStage() {
    //     return true;
    // }

    //Inherited from Performable interface
    @Override
    public void perform() {
        System.out.println("Tumutugtog si " + getName() + " ng piano na may " + numKeys + " keys.");
    }

    
}
