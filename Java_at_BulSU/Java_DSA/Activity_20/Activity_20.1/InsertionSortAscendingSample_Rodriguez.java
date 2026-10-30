public class InsertionSortAscendingSample_Rodriguez {
    public static void main(String[] args) {
        int[] arr = {7, 2, 6, 1, 4};
        insertionSort(arr);
        System.out.print("Final Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {

            int key = arr[i]; //2
            int j = i - 1; //0

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }
}