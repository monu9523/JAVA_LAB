// Base class
class Animal {
    protected String name;
    protected int age;
    protected Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    protected void makeSound() {
        System.out.println(name + " makes a sound.");
    }
    protected void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}   // Intermediate class
class Mammal extends Animal {
    protected boolean hasFur;
    protected Mammal(String name, int age, boolean hasFur) {
        super(name, age);
        this.hasFur = hasFur;
    }
    protected void walk() {
        System.out.println(name + " is walking.");
    }
    @Override
    protected void displayInfo() {
        super.displayInfo();
        System.out.println("Has Fur: " + (hasFur ? "Yes" : "No"));
    }
}// Derived class
class Dog extends Mammal {
    private String breed;
    protected Dog(String name, int age, boolean hasFur, String breed) {
        super(name, age, hasFur);
        this.breed = breed;
    }
    protected void bark() {
        System.out.println(name + " is barking.");
    }
    @Override
    protected void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: " + breed);
    }
}//  protected access
public class Animalhierarchy2 {
    public static void main(String[] args) {
   Dog dog = new Dog("draco",3, true, "pitbull");
        dog.displayInfo(); // Accessing protected method from the same package
        dog.makeSound();   // Accessing protected method from base class
        dog.walk();        // Accessing protected method from intermediate class
        dog.bark();        // Accessing protected method from derived class
    }
}