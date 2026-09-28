public class ArrayInsertion_Rodriguez {
    public static void main(String[] args) {
        int[] arr = new int [5];
        int size = 4;

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        int index = 2;
        int value = 99;

        System.out.println("Before insertion:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        if (size == arr.length) {
            System.out.println("\nArray full. Cannot insert.");
            System.out.println("Size is " + size);
            return;
        }

        for (int i = size-1; i >= index; i--) {
            arr[i+1] = arr[i];
        }

        arr[index] = value;
        size++;

        System.out.println("\nAfter insertion:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}