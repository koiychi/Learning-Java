public class Prob02_ForEachvsForLoop_Rodriguez {
    public static void main(String[] Koi) {
        int[] numbers = {5, 10, 15, 20};

        System.out.println("Using For Loop: ");
        for (int index = 0; index < numbers.length; index++) {
            System.out.println("Index " + index + ": " + numbers[index]);
        }

        System.out.println("\nUsing For-Each Loop: ");
        for (int num : numbers) {
            System.out.println(num);
        }

    }
}