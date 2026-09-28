import java.util.Scanner;

public class ArrayDeletionExamp_Rodriguez {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[10];
        int size;

        System.out.print("Enter number of elements (max 10): ");
        size = input.nextInt();

        System.out.println("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Enter position to delete (0 to " + (size - 1) + "): ");
        int pos = input.nextInt();

        for (int i = pos; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;

        System.out.println("Array after deletion:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        input.close();
    }
}