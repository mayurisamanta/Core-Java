public class Dog extends Mammal{

    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        Mammal dog = new Dog();
        dog.makeSound();
        dog.walk();
    }
}
