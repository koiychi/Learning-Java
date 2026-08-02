public class Bird extends Animal implements AirCapability, GroundCapability {
 public void eat(){
        System.out.println(super.getName() + " is eating.");
    }

    public void makeSound(){
        System.out.println("Chirp! Chirp!");
    }

    public void sleep(){
        System.out.println(super.getName() + " is sleeping.");
    }

    public Bird(String name) {
        super(name);
    }

    //FROM INTERFACE
    public void walk() {
        System.out.println(super.getName() + " is walking.");
    }

    public void jump() {
        System.out.println(super.getName() + " is jumping.");
    }

    public void fly() {
        System.out.println(super.getName() + " is flying.");
    }
}
