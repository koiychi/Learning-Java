import java.util.HashMap;

public class CodingDictionary_Miles_Rodriguez {
    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("OOP", "Object-Oriented Programming");
        dictionary.put("JDK", "Java Development Kit");
        dictionary.put("RAM", "Random Access Memory");

        System.out.println("--- Coding Dictionary ---");
        System.out.println("Looking up 'OOP': " + dictionary.get("OOP"));

        System.out.println("\nLooking up 'AI'");


        String word = "AI";
        if (dictionary.containsKey(word)) {
            dictionary.get(word);
        } else {
            System.out.println("ERROR: The abbreviation " + word + " is not found in this dictionary.");
        }

    }
}