// Base class
class Animal {
    protected String name;
    protected int age;
    protected Animal() {
        this.name = "Unknown";
        this.age = 0;
        System.out.println("Animal default constructor called");
    }
    protected Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Animal parameterized constructor called");
    }
    protected void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}// Intermediate class
class Mammal extends Animal {
    protected boolean hasFur;
    protected Mammal() {
        super();
        this.hasFur = true;
        System.out.println("Mammal default constructor called");
    }
    protected Mammal(String name, int age, boolean hasFur) {
        super(name, age);
        this.hasFur = hasFur;
        System.out.println("Mammal parameterized constructor called");
    }
}// Derived class
class Dog extends Mammal {
    private String breed;
    protected Dog() {
        super();
        this.breed = "Unknown";
        System.out.println("Dog default constructor called");
    }
    protected Dog(String name, int age, boolean hasFur, String breed) {
        super(name, age, hasFur);
        this.breed = breed;
        System.out.println("Dog parameterized constructor called");
    }
    protected void bark() {
        System.out.println(name + " is barking.");
    }
}// Demonstration of constructor chaining
public class Animalhier {
    public static void main(String[] args) {
        System.out.println("Creating Dog using default constructor:");
        Dog dog1 = new Dog();
        System.out.println("\nCreating Dog using parameterized constructor:");
        Dog dog2 = new Dog("draco", 3, true, "pitbull");
    }
}

