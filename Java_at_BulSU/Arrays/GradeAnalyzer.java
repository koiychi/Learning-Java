import java.util.Scanner;

class GradeAnalyzer {
    public static void main (String Koi[]) {
        Scanner scannerniKoi = new Scanner (System.in);
        boolean repeat = true;

    do {
        int counter = 0, numCount = 0;

        System.out.print("Number of Grades: ");
        numCount = scannerniKoi.nextInt();
        System.out.println();

        int[] grades = new int [numCount];

        do {
            System.out.print("Enter number " + (counter+1) + ": ");
            grades[counter] = scannerniKoi.nextInt();
            ++counter;
        } while (counter != numCount);
        
        int sum = 0;
        int highest = grades[0];
        
        for (int grade : grades) {
            sum += grade;
            if (grade > highest) {
                highest = grade;        
            }
        }
        double average = (double) sum/grades.length;
        System.out.println("Average Grade: " + average);
        System.out.println("Highest Grade: " + highest);   

        System.out.println();
        char rep;
        System.out.print("Repeat Program? (y/n): ");
        rep = scannerniKoi.next().charAt(0);

        if (rep == 'n') {
            repeat = false;
            }
        } while (repeat == true);
         
    }
}

