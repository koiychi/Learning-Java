//Week 1, Day 2 - Activity 1
//Methods

import java.util.Scanner;

public class App {

    static int add(int x, int y) {
            return x + y;
        }

    static int subtract (int x, int y) {
        return x - y;
    }

    static int multiply (int x, int y) {
        return x * y;
    }

    static int divide (int x, int y) {
        if (y == 0) {
            System.out.println(x + " can't be divided by zero.");
            return 0;
        } else {
            return x / y;
        }
    }

    public static void main(String[] args) throws Exception {
        int x, y;
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! Let's Calculate!");

        System.out.println("Enter your first number");
        x = input.nextInt();

        System.out.println("Enter your second number");
        y = input.nextInt();

        System.out.println("\nSum: " + add(x, y));
        System.out.println("Difference: " + subtract(x, y));
        System.out.println("Product: " + multiply(x, y));
        System.out.println("Quotient: " + divide(x, y));

        input.close();

    }
}
