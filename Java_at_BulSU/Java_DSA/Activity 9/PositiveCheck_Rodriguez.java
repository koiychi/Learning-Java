import java.util.Scanner;

public class PositiveCheck_Rodriguez {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a new number: ");
        int number = input.nextInt();

        if (number > 0) {
            System.out.println("The number is positive.");
        }

        System.out.println("Program finished.");
    }
}