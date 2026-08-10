/*
IT 203 - Object-Oriented Programming
Rodriguez, Miles J.
BSIT 2H-G1

Activity 5 - Polymorphism
*/

public class RobotTester {
    public static void main (String[] Koi) {
        Robot r = new CleaningRobot();
        System.out.println(r);
        System.out.println(r.label);

        Robot r2 = new Robot();
        CleaningRobot cr = (CleaningRobot) r2;
        System.out.println(cr);
    }
}
