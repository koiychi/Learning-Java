import java.util.Scanner;

public class BinarySearchExample_Rodriguez {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int size = arr.length;

        System.out.print("Enter number to search: ");
        int key = sc.nextInt();

        int low = 0, high = size - 1;
        int mid;
        boolean found = false;

        while (low <= high) {
            mid = (low + high) / 2;

            if (arr[mid] == key) {
                found = true;
                System.out.println("Number " + key + " found at index " + mid);
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if(!found) {
            System.out.println("Number " + key + " not found in array.");
        }

        sc.close();
    }
}