import java.util.Scanner;

public class ArrayTraversalScanner_Rodriguez {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many grades do you want to enter? ");
		int size = sc.nextInt();

		double[] grades = new double[size];

		for (int i = 0; i < grades.length; i++) {
			System.out.print("Enter grade #" + (i + 1) + ": ");
			grades[i] = sc.nextDouble();
		}

		System.out.println("\nGrades you entered: ");
		for (double g : grades) {
			System.out.println(g);
		}

		double total = 0;
		for (double g : grades) {
			total += g;
		}
		double average = total / grades.length;

		System.out.println("\nTotal of all grades: " + total);
		System.out.println("Average grade: " + average);

		sc.close();
	}
}