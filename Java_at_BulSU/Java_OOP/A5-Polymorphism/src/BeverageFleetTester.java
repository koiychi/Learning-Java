/*
IT 203 - Object-Oriented Programming
Rodriguez, Miles J.
BSIT 2H-G1

Activity 5 - Polymorphism
*/

public class BeverageFleetTester {
    public static void main (String[] Koi) {
        Beverage[] beverages = {
            new Coffee("For Koi", 5, 5),
            new Tea("Miles", 5, 5),
            new Smoothie("Rodriguez", 10, 9)
        };

        for(Beverage bev : beverages) {
            System.out.println(bev.toString());
            if (bev instanceof Smoothie) {
                //Beverage smoothie = new Smoothie(bev); 
                //smoothie.toString();
                bev.toString();
            }
        }
    }
}
