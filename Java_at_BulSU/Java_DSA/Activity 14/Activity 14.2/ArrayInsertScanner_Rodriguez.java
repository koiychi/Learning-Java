import java.util.Scanner;

public class ArrayInsertScanner_Rodriguez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int size;

        System.out.print("Enter number of elements: ");
        size = sc.nextInt();

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter position to insert (0 to " + size + "): ");
        int index = sc.nextInt();

        System.out.print("Enter value to insert: ");
        int value = sc.nextInt();

        if (size == arr.length) {
            System.out.println("Array is full! Cannot insert.");
        } else if (index < 0 || index > size) {
            System.out.println("Invalid index!");
        } else {
            for (int i = size-1; i >= index; i--) {
                arr[i + 1] = arr[i];
            }

            arr[index] = value;
            size++;

            System.out.println("Array after insertion: ");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}