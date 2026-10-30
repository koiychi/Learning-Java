import java.util.HashMap;

public class FruitBasket_Miles_Rodriguez {
    public static void main(String[] args) {
        HashMap<String, Integer> fruitBasket = new HashMap<>();

        fruitBasket.put("Apples", 10);
        fruitBasket.put("Bananas", 5);
        fruitBasket.put("Oranges", 8);

        System.out.println("--- My Fruit Basket ---");
        System.out.println("Initial Basket: " + fruitBasket);

        System.out.println("\nUpdating Apples: ");
        fruitBasket.put("Apples", 15);
        System.out.println("New Apple Count: " + fruitBasket.get("Apples"));

        System.out.println("\nChecking for Grapes...");
        System.out.println("Does the basket have grapes? " + fruitBasket.containsKey("Grapes"));

        System.out.println("\nFinal Basket: " + fruitBasket);
    }
}