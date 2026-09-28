import java.util.Scanner;
public class ArrayDeleteStringValue_Rodriguez {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = {"Anna", "Brian", "Carla", "David", "Ella"};
        int size = 5;

        System.out.println("Before deletion: ");
        for (int i = 0; i < size; i++) {
            System.out.print(names[i] + " ");
        }

        System.out.print("\n\nEnter name to delete: ");
        String target = input.nextLine();

        int pos = -1;

        for (int i = 0; i < size; i++) {
            if (names[i].equalsIgnoreCase(target)) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            System.out.println("\nName not found!");
        } else {
            for (int i = pos; i < size -1; i++) {
                names[i] = names[i + 1];
            }
            size--;

            System.out.println("\nAfter deleting \"" + target + "\":");
            for (int i = 0; i <  size; i++) {
                System.out.print(names[i] + " ");
            }
        }
        input.close();
        
    }
}