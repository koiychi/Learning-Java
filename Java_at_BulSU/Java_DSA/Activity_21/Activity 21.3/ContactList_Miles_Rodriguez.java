import java.util.HashMap;

public class ContactList_Miles_Rodriguez.java {
    public static void main(String[] args) {
        HashMap<String, String> contacts = new HashMap<>();
        contacts.put("Mom", "555-0123");
        contacts.put("Dad", "555-4567");
        contacts.put("Alex", "555-9876");

        System.out.println("---Contact List Example---");
        System.out.println("Total contacts stored: " + contacts.size());

        System.out.println("\nRemoving contact 'Alex'...");
        contacts.remove("Alex");

        System.out.println("updated List: " + contacts);
        System.out.println("Total contacts stored now: " + contacts.size());

    }
}