public class Prob3_DeleteLastElement_MilesRodriguez {
    public static void main(String[] Koi) {
        int[] numbers = {100, 200, 300, 400, 500};
        int size = numbers.length;

        System.out.println("Array Before Deletion: ");
        for (int elements : numbers) {
            System.out.print(elements + " ");
        }

        //Deleting the last element
        --size;
        for (int i = size; i < size; i++) {
            numbers[i] = numbers[i + 1];
        }

        System.out.println("\nArray After Deletion: ");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
