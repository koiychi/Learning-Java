import java.util.Scanner;

public class ArrayInsertString_Rodriguez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names =  new String[5];
        int size = 3;

        names[0] = "Anna";
        names[1] = "Ben";
        names[2] = "Chris";

        System.out.println("Before insertion: ");
        for (int i = 0; i < size; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println();

        System.out.print("Enter name to insert: ");
        String newName = sc.nextLine();
        System.out.print("Enter index to insert (0 to " + size + "): ");
        int index = sc.nextInt();

        for (int i = size-1; i >= index; i--) {
            names[i + 1] = names[i];
        }

        names[index] = newName;
        size++;

        System.out.println("After insertion: ");
        for (int i = 0; i < size; i++) {
            System.out.print(names[i] + " ");
        }

        sc.close();
    }
}