import java.util.List;
public class AnimalTest {
    public static void main(String[] args) {
        Animal orig = new Animal("Rex", 50);
        System.out.println("Original Name: " + orig.getName());
        System.out.println("Original Energy: " + orig.getEnergy());

        Animal copy = new Animal(orig);
        System.out.println(copy.getName() + " | " + copy.getEnergy());

        orig.addFavoriteFood("Apple");
        orig.addFavoriteFood("Banana");
        orig.addFavoriteFood("Cherry");

        //BAD PRACTICE: Returning the Original List
        //(1) Return original list
        System.out.println(orig.getFavoriteFoods());

        //(2) Inserting another entry through another list but containing the original list
        List<String> leakExample = orig.getFavoriteFoods();
        leakExample.add("*** Durian ***");

        System.out.println(orig.getFavoriteFoods());

        //SOLUTION: Implement defensive copy 
    

    }
}
