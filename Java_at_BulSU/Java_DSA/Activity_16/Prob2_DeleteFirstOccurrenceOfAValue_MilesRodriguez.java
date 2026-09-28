public class Prob2_DeleteFirstOccurrenceOfAValue_MilesRodriguez {
    public static void main(String[] Koi) {
        int[] numbers = {5, 15, 25, 15, 35};
        int size = numbers.length;

        System.out.println("Array Before Deletion: ");
        for (int elements : numbers) {
            System.out.print(elements + " ");
        }

        //Finding the position of the first 15
        int posOfFirst15 = 0;
        for (int finder = 0; finder < size; finder++) {
            if (numbers[finder] == 15) {
                posOfFirst15 = numbers[finder];
                break;
            }
        } 

        //Deleting the first 15 and adjusting the array
        for (int i = posOfFirst15; i < size - 1; i++) {
            numbers[i] = numbers[i + 1];
        }

        --size;

        System.out.println("\nArray After Deletion: ");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
