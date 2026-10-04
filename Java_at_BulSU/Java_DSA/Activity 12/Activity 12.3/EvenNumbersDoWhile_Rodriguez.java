public class EvenNumbersDoWhile_Rodriguez {
    public static void main(String[] args) {
        System.out.println("Even numbers from 2 to 100 (do-while): ");
        int i = 2;
        do {
            System.out.print(i + " ");
            i += 2;
        } while (i <= 100);
        System.out.println();
    }
}
