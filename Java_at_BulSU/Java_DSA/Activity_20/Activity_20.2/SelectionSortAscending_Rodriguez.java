public class SelectionSortAscending_Rodriguez {
    public static void main (String[] args) {
        int[] arr = {42, 11, 28, 7, 34};
        selectionSort(arr);
        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i; //1

            for (int j = i + 1; j < arr.length; j++) { //j=2
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}