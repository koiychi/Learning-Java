import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TryCatchBufferReadDemo_Rodriguez {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter your name: ");
		String name = br.readLine();
		System.out.println("Hello, " + name);

		System.out.print("Enter your age: ");
		String ageText = br.readLine();

		try {
			int age = Integer.parseInt(ageText);
			System.out.println("You are " + age + " years old.");
			System.out.println("Next year, you will be " + (age + 1));
		} catch (NumberFormatException e) {
			System.out.println("Oops! That is not a valid whole number.");
		}

		System.out.print("Enter your GPA: ");
		String gpaText = br.readLine();

		try {
			double gpa = Double.parseDouble(gpaText);
			System.out.println("Your GPA is " + gpa);
			System.out.println("If it improves by 0.5, it will be " + (gpa + 0.5));
		} catch (NumberFormatException e) {
			System.out.println("Oops! That is not a valid decimal number.");
		}
	}
}











