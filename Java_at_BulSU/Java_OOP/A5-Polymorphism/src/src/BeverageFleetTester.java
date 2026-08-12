/*
IT 203 - Object-Oriented Programming
Rodriguez, Miles J.
BSIT 2H-G1

Activity 5 - Polymorphism
*/

//COFFEE SHOP (BEVERAGE)

public class BeverageFleetTester {
    public static void main (String[] Koi) {
        Beverage[] beverages = {
            new Coffee("For Koi", 5, 5),
            new Tea("Miles", 5, 5),
            new Smoothie("Rodriguez", 10, 9)
        };

        for(Beverage bev : beverages) {
            System.out.println(bev.toString());
            
            if (bev instanceof Smoothie smoothie) {
                //smoothie.toString();
                //Dynamic Dispatch: Kahit si bev lang ang tawagin natin, kayang ma-determine ni Java kung saang class siya galing or anong type niya. So no need na baguhin yung code for new classes.
                System.out.println("From Smoothie Class (Num of fruits): " + smoothie.getNumFruits());
            }
        }
    }
}

/*  WRITTEN ANSWERS
    Part 2
    There's no need to change the code when the third sibling is added because in our code for the loop, we are referring to the superclass itself as an instance of an object using its own type (Beverage bev <-- si bev na isang Beverage yung chinecheck sa instanceof). 
  
    Part 3
    1 The first println prints the toString() method. Since toString() is built-in to a java program, and overriding it makes us customize it and therefore prints "CleaningRobot: Cleaning Robot". Also, even by just calling r, the program knows what toString() is to call through dynamic dispatch.
    2 The second println prints "Generic Robot". Although  r is technically a type of CleaningRobot, but when we are accessing a field, the type it was declared should be followed which is the Robot. Therefore, printing the field of the Robot instead of the CleaningRobot.
    3 Dynamic dispatch works only for methods. For fields on the other hand, it follows the type it was declared.

    Part 4
    1 It is neither an upcast nor downcast as r2 which is a Robot is already a Robot.
    2 The program did not complied as a CleaningRobot cannot be turned into a Robot. The program throws an Exception (ClassCastException). CleaningRobot is a type of Robot and Robot is not a CleaningRobot.
    3 if (r2 instanceof CleaningRobot cr) {
        System.out.println(cr);
    }

    Part 5
    1 Override - exact identical methods
    2 Overload - the parameters differs per each method
    3 Does not compile - the subclass has stricter access modifier
    4 Override - String is a child of the Object class
    5 Neither - ststic is used for the methods to stay only within a specific class, not objects, therefore cannot be overridden or overloaded (since they have the same parameters here)
    6 Does not compile - final method on the superclass, cannot be edited/overridden after





*/