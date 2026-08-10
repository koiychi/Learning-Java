//Week 1, Day 2 - Activity 2
// Methods - Calculator with Menu

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int x, y;
        int op = 0;
        boolean looped = true;

        do {
            System.out.println("\nLet's Calculate!");

            System.out.print("First Number: ");
            x = input.nextInt();

            System.out.print("Second Number: ");
            y = input.nextInt();

            Operations.showMenu();
            op = input.nextInt();

            switch(op) {
                case 1: 
                System.out.println("Sum: " + Operations.add(x, y));
                break;

                case 2: 
                System.out.println("Difference: " + Operations.subtract(x, y));
                break;

                case 3: 
                System.out.println("Product: " + Operations.multiply(x, y));
                break;

                case 4: 
                System.out.println("Quotient: " + Operations.divide(x, y));
                break;

                case 5: 
                System.out.println("Thank you! Program is closing...");
                looped = false;
                input.close();
                System.exit(0);
            }
        } while (looped==true);  
    }
}
