import java.util.LinkedList;
import java.util.Queue;

public class StandardFIFOQueue_Rodriguez {
    public static void main (String[] args) {
        //Create queue of strings
        Queue<String> line = new LinkedList<>();

        line.add("Alice");
        line.add("Bob");
        line.add("Charlie");
        System.out.println("Initial queue: " + line);

        String nextUp = line.element();
        System.out.println("Next person to be served: " + nextUp);
        
        String served1 = line.remove();
        System.out.println("Served: " + served1);
        System.out.println("Queue after serving: " + line);

        // line.remove();
        // line.remove(); causes the NoSuchElementException

        System.out.println(line.remove());
    }
        
}
