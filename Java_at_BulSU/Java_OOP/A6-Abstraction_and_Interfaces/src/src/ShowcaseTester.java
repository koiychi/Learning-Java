/*
IT 203 - Object-Oriented Programming
Rodriguez, Miles
BSIT 2H-G1

Activity 6 - Abstraction and Interfaces
*/

//Option 1: Music

public class ShowcaseTester {
    public static void main (String[] Koiychi) {
        Performable[] list = {
            new Guitar("Koi", 5),
            new Piano("Kai", 24),
            new Dancer("Koi")
        };

        for(Performable show : list) {
            show.perform();
            System.out.println("Need Stage? " + show.needsStage() + "\n");

        }


    }
}

/* WRITTEN ANSWERS

Part F:
1 Abstract - Abstract classes can store states or variables with values so that when we extend to them, we also inherit the values they have like the origin point and default rotation angle.
2 Interface - Since the classes are unrelated, they can have or share similar capabilities through using an interface.
3 Interface - Multiple interfaces can be implemented along with an extends to a class.
4 Abstract - We can extend to an abstract class and inherit the finished calculatePay method and then write the applyBonus() ourselves.


*/