/* 
  IT 203 - Object-Oriented Programming
  Activity 1
  Rodriguez, Miles
  BSIT 2H-G1
*/
public class Printer {

    //ATTRIBUTES / STATES

    // private instance fields
    private String brand;
    private String model;
    private int inkLevel;
    private boolean isJammed;

    // constant (final) for max resource value (ink level)
    public static final int MAX_INK_LEVEL = 100;

    // counter of total units produced shared by the entire class
    private static int totalUnitsProduced = 0;
    
    // No argument constructor (defaults brand and model to "Unknown")
    public Printer() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.inkLevel = MAX_INK_LEVEL;
        this.isJammed = false;
        totalUnitsProduced++; // incrementing the counter
    }

    public Printer(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.inkLevel = MAX_INK_LEVEL;
        this.isJammed = false;
        totalUnitsProduced++; // incrementing the counter
    }

    




    //METHODS (BEHAVIORS)
    
    public void reportJam() {
        this.isJammed = true;
        System.out.println("[ALERT] " + this.brand + " " + this.model + " printer has been jammed.");
    }

    public void fixJam() {
        this.isJammed = false;
        System.out.println("[STATUS] " + this.brand + " " + this.model + "'s jamming issue has been fixed.");
    }

    public void print(int pages) {
        // Cannot print if jammed
        if (this.isJammed) {
            System.out.println("[ERROR] Cannot print. Printer is jammed.");
            return; // Stop the method early if jammed
        }

        int inkNeeded = pages * 5; // 5 ink units per page x number of pages

        // Check first if there is enough ink to print
        if (inkNeeded <= this.inkLevel) {
            this.inkLevel -= inkNeeded;
            System.out.println("[SUCCESS] Successfully printed " + pages + " pages.");
        } else {
            // Notify or warn if ink level is low
            int possiblePages = this.inkLevel / 5;
            this.inkLevel -= (possiblePages * 5); 
            System.out.println("[WARNING] Ink ran out partway through! Printed " + possiblePages + " pages before stopping.");
        }
    }

    public void refill() {
        if (this.inkLevel < MAX_INK_LEVEL) {
            this.inkLevel = MAX_INK_LEVEL;
            System.out.println("[INFO] Ink refilled to maximum capacity.");
        } else {
            System.out.println("[INFO] The printer's ink is currently full. Use the ink first before refill to prevent overflow.");
        }
        
    }

    public void displayInfo() {
        System.out.println("[Printer Info]");
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Ink Level: " + this.inkLevel);
        System.out.println("Jammed: " + this.isJammed);
        System.out.println();
    }

    public static int getTotalUnitsProduced() {
        return totalUnitsProduced;
    }

    public String getModel() {
        return this.model;
    }

    public String getBrand() {
        return this.brand;
    }
}