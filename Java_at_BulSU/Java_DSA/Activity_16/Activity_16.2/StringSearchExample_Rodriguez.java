import java.util.Scanner;

public class StringSearchExample_Rodriguez {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //1. Declare and initialize the array
        String[] names = {"Anna", "Brian", "Carla", "David", "Ella"};

        //2. Display the elements
        System.out.println("List of names: ");
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ". " + names[i]);
        }

        //3. Ask the user to input the name to search
        System.out.print("\nEnter a name to search: ");
        String target = input.nextLine();

        //4. Initialize a flag variable to track if found
        boolean found = false;

        //5. Search through the array using a for loop
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(target)) {
                System.out.println("\n " +  target + " found at index " + i);
                found = true;
                break;
            }
        }

        //6. If not found, show message
        if (!found) {
            System.out.println("\n " + target + " not found in the list.");
        }

        input.close();
    }
}




