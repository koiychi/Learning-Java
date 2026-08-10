public class Operations {
    static void showMenu(){
        System.out.println("\nSelect operation:\n[1] Addition \n[2] Subtraction \n[3] Multiplication \n[4] Division \n[5] Exit Program");
    }
    static int add(int x, int y) {
        return x + y;
    }

    static int subtract(int x, int y) {
        return x - y;
    }

    static int multiply(int x, int y) {
        return x * y;
    }

    static double divide(int x, int y) {
        if (y==0) {
            System.out.println(x + " can't be divided by zero.");
            return 0;
        } return (double) x / y;
    }
}
