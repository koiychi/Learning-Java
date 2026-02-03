import java.util.Scanner;
public class ExamScores {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[] scores = new int[5];
        double sum = 0;
        double average = 0;

        System.out.println("Enter your Exam Scores :>");
        for (int x = 0; x < scores.length; x++){
            int num = x+1;
            System.out.print("Score number " + num + ": ");
            scores[x] = input.nextInt();
        }
        
        //SUM
        for (int s = 0; s < scores.length; s++){
            sum += scores[s];
        }
        
        System.out.println("Sum of Scores: " + sum);

        //AVERAGE
        average = sum/scores.length;
        System.out.println("Average of Scores: " + average);

        //HIGHEST - LOWEST
        int min = scores[0];
        int max = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }

            if (scores[i] < min) {
                min = scores[i];
            }
        }

        System.out.println("Highest Score is: " + max);
        System.out.println("Lowest Score is: " + min);

        input.close();

    }
}
