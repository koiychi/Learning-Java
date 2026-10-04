import java.util.LinkedList;

//SAMPLE PROBLEM 2
public class LinkedListProb2_MilesRodriguez {
    public static void main(String[] koiychi) {
        //Creatiug a LinkedList of String
        LinkedList<String> products = new LinkedList<>();

        //Adding 5 products to the list
        products.add("Keyboard");
        products.add("Mouse");
        products.add("Monitor");
        products.add("Printer");
        products.add("Webcam");

        //Display original product list
        System.out.println("Original Product List: ");
        System.out.println(products);

        //Inserting (adding) "USB Hub" at index 2
        System.out.println("\nAfter inserting USB Hub: ");
        products.add(2, "USB Hub");
        System.out.println(products);

        //Updating index 3 item to Mechanical Keyboard
        System.out.println("\nAfter updating index 3: ");
        products.set(3, "Mechanical Keyboard");
        System.out.println(products);

        //Searching for "Printer"
        String searchedProduct = "Printer";

        if (products.contains(searchedProduct)) {
            System.out.println("\n" + products.get(products.indexOf(searchedProduct)) + " is available.");
        } else {
            System.out.println(searchedProduct + " is not available");
        }
        //Displaying final product list
        System.out.println("\nFinal Product List: ");
        System.out.println(products);

    }
}