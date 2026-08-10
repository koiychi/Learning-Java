import java.util.Scanner;

public class MyScanner_Rodriguez {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String name = input.nextLine();

		System.out.print("Enter your age: ");
		int age = input.nextInt();

		System.out.print("Enter the price of an item: ");
		double price = input.nextDouble();

		System.out.println("\n--- Output ---");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Price: $" + price);

		input.close();
	}
}