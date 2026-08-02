//ABSTRACTION DEMO
public abstract class Animal {
    private String name;
    
    public abstract void eat();
    public abstract void makeSound();
    public abstract void sleep();

    //Constructor
    public Animal(String name) {
        this.name = name;
    }

    //Getter method for name
    public String getName() {
        return name;
    }

}
