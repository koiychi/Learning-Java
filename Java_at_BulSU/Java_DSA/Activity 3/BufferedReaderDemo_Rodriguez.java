import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderDemo_Rodriguez {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter your name: ");
		String name = br.readLine();
		System.out.println("Hello, " + name);

		System.out.print("Enter your age: ");
		String ageText = br.readLine();
		int age = Integer.parseInt(ageText);
		System.out.println("You are " + age + " years old.");
		System.out.println("Next year, you will be " + (age + 1));
	
		System.out.print("Enter your GPA: ");
		String gpaText = br.readLine();
		double gpa = Double.parseDouble(gpaText);
		System.out.println("Your GPA is " + gpa);
		System.out.println("If it improves by 0.5, it will be " + (gpa + 0.5));
	}
}





