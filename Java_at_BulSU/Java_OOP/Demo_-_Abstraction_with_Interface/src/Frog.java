public class Frog extends Animal implements GroundCapability, WaterCapability {
     public void eat(){
        System.out.println(super.getName() + " is eating.");
    }

    public void makeSound(){
        System.out.println("Kokak! Kokak!");
    }

    public void sleep(){
        System.out.println(super.getName() + " is sleeping.");
    }

    public Frog(String name) {
        super(name);
    }

    //FROM INTERFACE
    public void walk() {
        System.out.println(super.getName() + " is walking.");
    }

    public void jump() {
        System.out.println(super.getName() + " is jumping.");
    }

    public void swim() {
        System.out.println(super.getName() + " is swimming.");
    }

}
