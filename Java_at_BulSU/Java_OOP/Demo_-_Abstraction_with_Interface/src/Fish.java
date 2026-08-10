public class Fish extends Animal implements WaterCapability {
 public void eat(){
        System.out.println(super.getName() + " is eating.");
    }

    public void makeSound(){
        System.out.println("Blob... blob... blob...");
    }

    public void sleep(){
        System.out.println(super.getName() + " is sleeping.");
    }

    public Fish(String name) {
        super(name);
    }

    //FROM INTERFACE
    public void swim() {
        System.out.println(super.getName() + " is swimming.");
    }
}
