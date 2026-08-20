public class Prob04_CountElementsTraversed_Rodriguez {
    public static void main(String[] Koi) {
        double[] nums = {88.5, 90.0, 78.5};
        int counter = 0;

        for (int index = 0; index < nums.length; index++) {
            ++counter;
        }
        System.out.println("Number of elements traversed: " + counter);
    }
}