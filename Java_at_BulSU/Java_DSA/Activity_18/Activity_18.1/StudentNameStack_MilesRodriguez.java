import java.util.Stack;
public class StudentNameStack_MilesRodriguez {
    public static void main(String[] koi) {
        Stack<String> students = new Stack<>();

        students.push("Ana");
        students.push("Ben");
        students.push("Carlo");
        students.push("Diana");
        students.push("Eric");

        System.out.println("Original Student Stack:");
        System.out.println(students);

        System.out.println("\nTop student name (peek): " + students.peek());
        String removedName = students.pop();
        System.out.println("Removed student name (pop): " + removedName);

        System.out.println("\nUpdated student stack: ");
        System.out.println(students);

        System.out.println("\nNumber of students remaining: " + students.size());

    }
}