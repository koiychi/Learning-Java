import java.util.LinkedList;


//SAMPLE PROBLEM 1
public class LinkedListProb1_MilesRodriguez {
    public static void main(String[] koiychi) {

        //Creating the LinkedList containing Strings
        LinkedList<String> students = new LinkedList<>();

        //Adding 5 student names in the LinkedList
        students.add("MJ");
        students.add("LJ");
        students.add("Sandra");
        students.add("Talee");
        students.add("Jake");

        //Showing all students (original)
        System.out.println("Original Student List: ");
        System.out.println(students);

        //Adding a student name at the beginning of the LinkedList
        students.addFirst("Miles");

        //Adding a student name at the end of the LinkedList
        students.addLast("Koi");

        //Display updated list
        System.out.println("\nUpdated Student List: ");
        System.out.println(students);

        //Searching a particular name in the list
        String nameSearching = "Miles";

        if (students.contains(nameSearching)) {
            System.out.println("\n" + students.get(students.indexOf(nameSearching)) + " is found in the list.");
        } else {
            System.out.println("\n" + nameSearching + " is not found in the list.");
        }
        
        //Counting all students in the list

        System.out.println("Number of Students: " + students.size());

    }
}