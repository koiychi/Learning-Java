public class ArrayDeleteFirstElement_Rodriguez {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40 , 50};
        int size = 5;

        System.out.println("Before deletion: ");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;

        System.out.println("\n\nAfter deleting FIRST element: ");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}