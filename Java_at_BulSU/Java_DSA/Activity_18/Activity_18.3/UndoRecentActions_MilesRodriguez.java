import java.util.Stack;

public class UndoRecentActions_MilesRodriguez {
    public static void main(String[] koi) {
        Stack<String> actions = new Stack<>();

        actions.push("Typed title");
        actions.push("Added paragraph");
        actions.push("Inserted image");
        actions.push("Changed font size");
        actions.push("Changed text color");

        System.out.println("Original Action List: \n" + actions);

        System.out.println("\nMost recent action: " + actions.peek());
        System.out.println("Is 'Added paragraph' found? " + actions.contains("Added paragraph"));

        String undo;
        undo = actions.pop();
        System.out.println("\nUndoing most recent action: " + undo);
        undo = actions.pop();
        System.out.println("\nUndoing most recent action: " + undo);

        System.out.println("\nRemaining actions in workspace:\n" + actions);

        System.out.println("\nNumber of actions remaining: " + actions.size());

        System.out.println("\nClearing remaining actions from stack...");
        String removedAction;

        while(actions.size() > 0) {
            removedAction = actions.pop();
            System.out.println("Removing: " + removedAction);
        }

        System.out.println("\nFinal stack list: " + actions);
        System.out.println("Is the action stack empty? " + actions.isEmpty());
    }
}