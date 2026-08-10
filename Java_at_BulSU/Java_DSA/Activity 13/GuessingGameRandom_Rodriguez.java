import java.util.Scanner;

public class GuessingGameRandom_Rodriguez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int secretNumber = (int)(Math.random() * 100) + 1;
        int guess = 0;

        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("Try to guess the secret number between 1 to 100.");
        System.out.println("(Type a number. No tricks please.)");

        do {
            System.out.print("Enter your guess: ");
            if (sc.hasNextInt()) {
                guess = sc.nextInt();

                if (guess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > secretNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Correct! You guessed the number!");
                }
            } else {
                System.out.println("Invalid input. Please enter numnbers only.");
                sc.next();
            }
        } while(guess != secretNumber);
        sc.close();
    }
}