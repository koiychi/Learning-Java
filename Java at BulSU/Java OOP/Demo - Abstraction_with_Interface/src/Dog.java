public class Dog extends Animal implements GroundCapability {

    //ABSTRACT METHODS FROM ANIMAL (INHERITED)
    public void eat(){
        System.out.println(super.getName() + " is eating.");
    }

    public void makeSound(){
        System.out.println("Arf Arf!");
    }

    public void sleep(){
        System.out.println(super.getName() + " is sleeping.");
    }

    //FROM INTERFACE
    public void walk() {
        System.out.println(super.getName() + " is walking.");
    }

    public void jump() {
        System.out.println(super.getName() + " is jumping.");
    }

    public Dog(String name) {
        super(name);
    }
}
