package day50_inheritance.overriding;

public class AnimalObject {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "Grey";
        animal.type = "PitBul";
        animal.speak();


        Cat cat = new Cat();
        cat.speak();

        Dog dog = new Dog();
        dog.speak();

    }
}
