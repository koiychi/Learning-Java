public class Prob01_ReverseTraversal_Rodriguez {
    public static void main(String[] Koi) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Array in reversed order: ");
        for (int index = numbers.length - 1; index >= 0; index--) {
            System.out.println(numbers[index]);
        }
    }
}