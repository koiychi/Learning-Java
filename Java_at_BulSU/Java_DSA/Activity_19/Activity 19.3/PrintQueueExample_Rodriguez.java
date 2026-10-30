import java.util.ArrayDeque;
import java.util.Queue;

public class PrintQueueExample_Rodriguez {
    public static void main(String[] args) {
        Queue<String> printQueue = new ArrayDeque<>();

        printQueue.add("Tax_Return_2026.pdf");
        printQueue.add("Quarterly_Report.docx");
        printQueue.add("Family_Photo.jpg");
        System.out.println("Current Print Queue: " + printQueue);

        String nextJob = printQueue.element();
        System.out.println("\nNext document to print: " + nextJob);

        System.out.println("\n--- Starting Printing Process ---");
        while (!printQueue.isEmpty()) {
            String activeJob = printQueue.remove();
            System.out.println("Printing: " + activeJob + " ... Done!");
        }

        System.out.println("\nIs the print queue empty? " + printQueue.isEmpty());
    }
}
