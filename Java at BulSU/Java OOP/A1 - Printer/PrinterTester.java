/* 
  IT 203 - Object-Oriented Programming
  Activity 1
  Rodriguez, Miles
  BSIT 2H-G1
*/

/*
Demonstrations: 
Part C: 
a. Object creation - Line 29-34
b. Independent state demonstration - Line 37-92
c. Reference aliasing demonstration - Line 53-79
d. Static method call & output -  Line 96-100

Part D: 
Reflections - Line 108-129

*/

//Console Colors for readability: Blk("\u001B[0m"), Grn("\u001B[32m"), Ylw(\u001B[33m)
public class PrinterTester {

    public static void main(String[] args) {
        System.out.println("==========================");
        System.out.println(" PRINTER OOP - Activity 1\n Rodriguez, Miles | BSIT 2H-G1");
        System.out.println("==========================");

        //Part C: Creating objects
        System.out.println("\n\u001B[32m CREATING PRINTERS: \u001B[0m ");
        Printer printer1 = new Printer("HP", "LaserJet"); //Using constructors
        Printer printer2 = new Printer("Canon", "Pixma");
        Printer printer3 = new Printer(); // Unknown brand and model
        System.out.println("[INFO] " + Printer.getTotalUnitsProduced() + " printers were manufactured.\n");
        

        //TESTING PRINTER 1
        System.out.println("==========================");
        System.out.println("\u001B[32m PRINTING ON PRINTER 1 (Normal): \u001B[0m");
        System.out.println("==========================");
        System.out.println("\u001B[33m Before Printing \u001B[0m \n");
        printer1.displayInfo();
        System.out.println("--------------------------");


        System.out.println("\n\u001B[33m [PRINT] Printing 6 pages on " + printer1.getBrand() + " " + printer1.getModel() + "\u001B[0m");
        printer1.print(6); // 6 pages x 5 ink units = must use 30 units of ink

        System.out.println("\n\u001B[33m After Printing \u001B[0m\n");
        printer1.displayInfo();

        
        //TESTING PRINTER 2

        System.out.println("==========================");
        System.out.println("\u001B[32m REPORTING A JAMMING ISSUE ON PRINTER 2: \u001B[0m");
        System.out.println("==========================");

        //Info before reporting a jam
        System.out.println("\u001B[33m Before Reporting a Jam \u001B[0m\n");
        printer2.displayInfo();
        System.out.println("--------------------------");

        //Jamming issue reported
        System.out.println("\n\u001B[33m Reporting a jamming issue \u001B[0m\n");
        printer2.reportJam();

        //Info after reporting a jam
        System.out.println("\n\u001B[33m After Reporting a Jam \u001B[0m\n");
        printer2.displayInfo();

        //Fixing a jamming issue but through an alias
        System.out.println("\n\u001B[33m Fixing jamming issue \u001B[0m\n");
        Printer printer_kong_jammed_lagi = printer2;
        printer_kong_jammed_lagi.fixJam();

        //Info after fixing a jamming issue
        System.out.println("\n\u001B[33m After Fixing a Jam \u001B[0m\n");
        printer2.displayInfo();


        //TESTING PRINTER 3
        System.out.println("==========================");
        System.out.println("\u001B[32m INK REFILL ON PRINTER 3 (but printer's ink is currently full):\u001B[0m");
        System.out.println("==========================");

        System.out.println("\u001B[33m Before Refill \u001B[0m\n");
        printer3.displayInfo();
        System.out.println("--------------------------");

        System.out.println("\n\u001B[33m [REFILL] Preparing refill on " + printer3.getBrand() + " " + printer3.getModel() + "\u001B[0m");
        printer2.refill();



        System.out.println("\n\n==========================");
        System.out.println("\u001B[32m MANUFACTURED PRINTER COUNT:\u001B[0m");
        System.out.println("==========================");
        // Printing the total number of units produced by calling the static method through the class name
        System.out.println("Total Printers Produced: " + Printer.getTotalUnitsProduced());

    } // end of main()

} // end of PrinterTester class


/*
    ==========================================
                PART D: REFLECTION
    ==========================================

    1. Describe the stack and heap for your three objects right after the aliasing step in
    Part C: what variables live on the stack, what do they point to, and how many actual
    objects exist on the heap?
    >> At first, I have three printer objects, and I imagine them pointing to three things that really exist in the program (the actual objects in the heap). After the aliasing step, one of my printers gets a nickname. This nickname is a new variable used in the stack, but it doesn't create a new printer. In this program, there is really a printer2 in the heap. I made another variable and called it alias "printer_kong_jammed_lagi", but still it points to the original "printer2". With that, when working on the alias, it still affect the original object. For the stack, they are two different objects, but for the heap, they are just the same. So instead of having 4 objects on the heap, there are just 3, as one carrying the alias just point to an existing object in the heap.

    2. In your own words, without reusing the blueprint/cookie-cutter analogy from the
    reading, explain why calling a method on a null reference throws a
    NullPointerException.
    >> A reference's job is to point or refer into something. If it is a null which means nothing, there's nothing to point to or call on. It is like searching for an object that doesn't exist or going for a destination then reaching a dead end as that place do not really exist.

    3. Why must the shared counter be static instead of an ordinary instance field? What
    would go wrong if it were not?
    >> Static allows variables to stay in one place but still can be accessed anywhere by just calling its class. If the counter stays in a class while not being static, then every object created though that class will have the counter at 1 only. They will only count themselves as they are not aware of other objects created and using the counter variable. Thus, invalidating the purpose of the counter.

    4. Using your own analogy (not the one from the reading), explain the difference
    between your class and one of its objects
    >> I can associate classes with a recipe book. In the recipe book, there are the ingredients needed in making a dish, as well as the procedures. On the other hand, an object is the product of combined ingredients given by the recipe book. 
*/