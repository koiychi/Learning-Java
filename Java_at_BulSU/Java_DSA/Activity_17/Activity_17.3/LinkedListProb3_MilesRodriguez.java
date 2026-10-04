import java.util.LinkedList;

//SAMPLE PROBLEM 3

public class LinkedListProb3_MilesRodriguez {
    public static void main(String[] koiychi) {
        //Creating a LinkedList of Strings
        LinkedList<String> students = new LinkedList<>();

        //Adding 5 students in the LinkedList
        students.add("MJ");
        students.add("LJ");
        students.add("Sandra");
        students.add("Talee");
        students.add("Jake");

        //Display the original student list
        System.out.println("Original Student List");
        System.out.println(students);

        //Adding new student at the beginning and the end of the list
        students.addFirst("Miles");
        students.addLast("Koi");

        //Displaying student list after adding new students at the beginning and end of the list
        System.out.println("\nAfter adding Miles and Koi");
        System.out.println(students);

        //Inserting another student at index 3
        students.add(3, "Daniel");

        //Display updated student list after adding a student at index 3
        System.out.println("\nAfter inserting Daniel at index 3");
        System.out.println(students);

        //Searching for a student at a specific index
        int index = 2;
        System.out.println("\nStudent at index " + index + ": " + students.get(2));
        System.out.println(students.get(index) + " is enrolled.");

        //Removing a student 
        int studentIndexToRemove = 2;

        System.out.println("\nAfter Removing " + students.get(studentIndexToRemove));
        students.remove(studentIndexToRemove);
        System.out.println(students);

        //Counting students in the list
        System.out.println("\nTotal Students: " + students.size());

        //Check if list is empty or not
        int studentCount = students.size();
        if (studentCount > 0) {
            System.out.println("The student list is not empty");
        } else {
            System.out.println("The student list is empty.");
        }
    }
}