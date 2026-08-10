/*
IT 203 - Object-Oriented Programming
Rodriguez, Miles J.
BSIT 2H-G1

Activity 3 - Inheritance
*/

public class ApplianceTester {
    public static void main(String[] koiychi) {
        //PART F
        //ITEM 1 AND 2
        System.out.println("Option 1: Household Appliance Family\n");

        System.out.println("\nA. Inherited Superclass\n");
        Appliance genericAppliance = new Appliance("TV Brand", "TV-123 Pro Max", 100);
        System.out.println(genericAppliance.getStatusReport());

        System.out.println("\nB. Refrigerator (Subclass)\n");
        Refrigerator refrigerator = new Refrigerator("Fujidenzo", "Fuji-1023", 175, 0);
        System.out.println(refrigerator.getStatusReport());

        System.out.println("\nC. Washing Machine (Subclass)\n");
        WashingMachine washingMachine = new WashingMachine("Hanabishi", "Hanabishi Wash Wash 123", 250,"idle", 900);
        System.out.println(washingMachine.getStatusReport());

        //ITEM 3
        Refrigerator ref1 = new Refrigerator("Fujidenzo", "Fuji-1023", 175, 0);

        Refrigerator ref2 = new Refrigerator("Fujidenzo", "Fuji-1023", 175, 0);

        System.out.println("\nIs ref1 and ref2 equal?: " + (ref1 == ref2));

    }
}

/*
PART A: IS-A or HAS-A

1. A Sedan and a Car
IS-A - A Sedan is a type of a car, therefore a property of a car can also be a property of a sedan. 

2. A Car and a Steering Wheel
HAS-A - A car is not a type of a steering wheel or vice versa, a steering wheel is a part or a component of a car.

3. A Penguin and a Bird
IS-A - A penguin is a type of bird.

4. A Bird and a Nest
HAS-A - A bird might have a nest but bird is not a type of nest.

5. A Laptop and a Battery
HAS-A - A battery is just a component of a laptop, not another type of it.

6. An Ebook and a Document
IS-A - An Ebook is a type of document.

7. A House and a Thermostat
HAS-A - A house might contain a thermostat but a house will never be a thermostat.

8. A Skyscraper and a Building.
IS-A - A skyscraper is a building.

----------------------------------------------------------------------
PART C: Item 4
The program containing super() and this() won't compile as according to rules, they need to be the first statement to be declared within a constructor method to let Java know what to do first. By combining them both in a single method, one of them would be on a line after the other. Also, the subclass should inherit first from the superclass before filling an empty constructor within the same class, but they need to be separate. This makes the inheritance process predictable for Java.

----------------------------------------------------------------------
PART E: 
1. Written: list and explain the three requirements a subclass method must satisfy to count as a genuine override of a superclass method.
Answer: Same method name, public access modifier, same return type as the    superclass. 

To override, of course the subclass version of the method needs to be the same in terms of name and return type with the superclass version. It is because we're just copying what is already existing and modifying it to add more to prevent creating another method with the same contents. Also, the subclass method must be declared public as it cannot be the same as private as the superclass.


2. Written: explain what the @Override annotation does, and why adding it to every intended override is good practice even though Java does not require it.
Answer: @Override allows us to use existing methods and modify them according to our needs. Without overriding, we might need to create different methods even if with the same content, and for the same uses. 


3. Written: for each of the two snippets below, state whether the subclass method is a true override, and explain why or why not.
Answer: On the snippet A, it would compile but it is not really an override as it is an example of method overloading as only the parameters are changed. On the other hand, Snippet B would not compile as the subclass version of the method has stricter access modifier than the superclass. 




*/
