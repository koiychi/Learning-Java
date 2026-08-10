import java.util.ArrayList;
import java.util.List;

public class Animal {
    private String name;
    private int energy; // maintain from 0-100;
    private List<String> favoriteFoods;

    //MASTER CONSTRUCTOR / PARAMETERIZED
    public Animal(String name, int energy) {
        this.name = name;
        this.energy = energy;
        this.favoriteFoods = new ArrayList<>();
    }

    //DEFAULT CONSTRUCTOR / NO-ARGUMENT CONSTRUCTOR / EMPTY CONSTRUCTOR
    public Animal() {
        // this.name = "Unknown";
        // this.energy = 0;

        this("Unknown", 0); // <--- this chaining
    }

    //COPY CONSTRUCTOR
    public Animal(Animal other) {
        this(other.name, other.energy);
    }

    //GETTERS / GET METHODS
    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    //With defensive copy --> Creating a new copy every call of this method to prevent leaking and changing the original list
    public List<String> getFavoriteFoods() {
        return new ArrayList<>(favoriteFoods);
    }

    //SETTERS / SET METHODS
    public void setEnergy(int energy) { //<-- this includes validation to prevent accepting negative or > 100 values
        if (energy < 0 || energy > 100) {
            throw new IllegalArgumentException("Energy must be from 0 to 100. Got " + energy);
        }
        this.energy = energy;
    }

    //OTHER METHODS
    public void addFavoriteFood(String food) {
        favoriteFoods.add(food); //.add() already included on List<>
    }

    //OVERLOADED METHODS
    public void feed(int amount) {
        if(amount <= 0) {
            throw new IllegalArgumentException("Feed amount must be positive. Got " + amount);
        }
        setEnergy(Math.min(100, energy + amount)); //Math.min limits to the minimum amount (min: 100)
    }

    public void feed(int amount, boolean isTreat) {
        feed(isTreat ? amount * 2 : amount); //If true, amount doubles, else, amount stays the same
    }
}
