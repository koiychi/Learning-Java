public class Prob1_DeleteElementAtSpecificIndex_MilesRodriguez {
    public static void main(String[] Koi) {
        int[] numbers = {10, 20, 30, 40, 50};
        int size = numbers.length; //5

        System.out.println("Array Before Deletion: ");
        for (int elements : numbers) {
            System.out.print(elements + " ");
        }

        //Deleting Element on Index 2 (3rd element)
        for (int i = 2; i < size - 1; i++) {
            numbers[i] = numbers[i + 1];
        }

        --size;

        System.out.println("\nArray After Deletion: ");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}

//not really nawala yung last index