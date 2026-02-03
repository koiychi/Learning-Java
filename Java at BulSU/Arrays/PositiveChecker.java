import java.util.Scanner;

class PositiveChecker {

    public static void main (String Koi[]) {
        Scanner scannerniKoi = new Scanner (System.in);
        int number;

        System.out.print("Enter a number: ");
        number = scannerniKoi.nextInt();

        if (number > 0) {
            System.out.println("The number is a positive number.");
        } else {
            System.out.println("The number is not a positive number.");
        }
    } // end of main()
} // end of PositiveChecker
