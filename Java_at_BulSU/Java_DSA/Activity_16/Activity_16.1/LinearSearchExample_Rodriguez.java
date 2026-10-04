import java.util.Scanner;

public class LinearSearchExample_Rodriguez {
    public static void main(String[] Koi) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};
        int size = arr.length;

        System.out.print("Enter number to search: ");
        int key = sc.nextInt();

        boolean found = false;
        int pos = -1;

        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                found = true;
                pos = i;
                break;
            }
        }

        if (found) {
            System.out.println("Number " + key + " found at " + pos);
        } else {
            System.out.println("Number " + key + " not found in array.");
        }

        sc.close();
    }
}
