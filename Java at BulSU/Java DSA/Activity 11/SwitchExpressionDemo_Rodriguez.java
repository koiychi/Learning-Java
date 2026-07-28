import java.util.Scanner;
public class SwitchExpressionDemo_Rodriguez {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day number (1 = Monday, 7 = Sunday): ");

        if (sc.hasNextInt()) {
            int day = sc.nextInt();

            String message = switch (day) {
                case 1 -> "Monday - Start of the week!";
                case 2 -> "Tuesday - Keep going!";
                case 3 -> "Wednesday - Midweek!";
                case 4 -> "Thursday - Almost Friday!";
                case 5 -> "Friday - Weekend is near!";
                case 6, 7 -> "Weekend - Time to relax!";
                default -> "Invalid day, Please enter a number"; 
            };

            System.out.println("Result: " + message);
        } else {
            System.out.println("Invalid input. Please enter a NUMBER between 1 and 7.");
        }
        sc.close();
    }
}
