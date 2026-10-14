import java.util.Stack;

public class BrowserBackHistory_MilesRodriguez {
    public static void main(String[] koi) {
        Stack<String> browsingHistory = new Stack<>();
        
        browsingHistory.push("Home");
        browsingHistory.push("Student Portal");
        browsingHistory.push("Course Materials");
        browsingHistory.push("Java Lessons");

        System.out.println("Original History List: \n" + browsingHistory);

        System.out.println("\nCurrent Page: " + browsingHistory.peek());

        browsingHistory.push("Quiz Page");
        System.out.println("\nAfter visiting Quiz page: \n" + browsingHistory);

        System.out.println("\nSimulating Back button...");
        String removedPage = browsingHistory.pop();
        System.out.println("Removed page: " + removedPage);
        System.out.println("\nCurrent page after going back: " + browsingHistory.peek());

        System.out.println("\nFinal Browser History: \n" + browsingHistory);
        
        System.out.println("\nNumber of pages remaining: " + browsingHistory.size());
    }
}