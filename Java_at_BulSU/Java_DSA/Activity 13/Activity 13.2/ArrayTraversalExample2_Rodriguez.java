public class ArrayTraversalExample2_Rodriguez {
	public static void main(String[] args) {
		double[] scores = {85.5, 90.0, 78.5, 88.0, 92.5};
		double total = 0;

		for (double s : scores) {
			total += s;
		}

		double average = total / scores.length;

		System.out.println("Scores of the class: ");
		for (double s : scores) {
			System.out.println(s);
		}

		System.out.println("\nTotal score: " + total);
		System.out.println("Average score: " + average);
	}
}