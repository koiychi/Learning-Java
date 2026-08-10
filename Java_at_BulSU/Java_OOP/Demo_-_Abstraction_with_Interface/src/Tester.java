public class Tester {
    public static void main(String[] args) {

        //ABSTRACT OBJECT
        // - instance of the abstract class (cannot run)
        // Animal animal = new Animal();
        //- Cannot run as it is abstract, not a specific animal yet


        //CONCRETE OBJECT
        Dog dog = new Dog("Koi");
        Cat cat = new Cat("Posang Tilapia");
        Frog frog = new Frog("Mr. Kokak");
        Fish fish = new Fish("Nemo");
        Bird bird = new Bird("Tweety");

        //Making sounds
        dog.makeSound();
        cat.makeSound();
        frog.makeSound();
        fish.makeSound();
        bird.makeSound();

        //Gutom na ang mga hayop na yan, eat na
        System.out.println();
        dog.eat();
        cat.eat();
        frog.eat();
        fish.eat();
        bird.eat();

        //Executing capabilities
        System.out.println();
        cat.walk();
        bird.walk();
        bird.fly();
        cat.jump();
        cat.eat();
        frog.swim();
        frog.jump();
        dog.walk();
        dog.jump();
    }
}
