public class Cat extends Animal implements GroundCapability {
     public void eat(){
        System.out.println(super.getName() + " is eating.");
    }

    public void makeSound(){
        System.out.println("Meow! Meow!");
    }

    public void sleep(){
        System.out.println(super.getName() + " is sleeping.");
    }

    public Cat(String name) {
        super(name);
    }

    //FROM INTERFACE
    public void walk() {
        System.out.println(super.getName() + " is walking.");
    }

    public void jump() {
        System.out.println(super.getName() + " is jumping.");
    }

}
