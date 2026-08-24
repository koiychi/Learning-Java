public class Prob05_FormatOutputTraversal_Rodriguez {
    public static void main(String[] Koi) {
        int[] nums = {1, 2, 3, 4, 5};

        System.out.print("Array elements: ");
        for (int index = 0; index < nums.length; index++) {
            System.out.print(nums[index]);
            if (index < nums.length - 1) {
                System.out.print(", ");
            }  
        }
    }
}