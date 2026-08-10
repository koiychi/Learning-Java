public class Guitar extends Instrument implements FeaturedAct {
    private int numStrings;
    public String produceSound() {
        return "Kring kring";
    }

    public String getBillingName() {
        return "Billing";
    }

    public boolean needsStage(){
        return true;
    }

    public void perform() {
        System.out.println("Performing guitar...");
    }

    public String getMaintenanceSchedule() {
        return "Performance schedule";
    }
    

    public Guitar(String name, int numStrings) {
        super(name);
        setNumStrings(numStrings);
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


}
