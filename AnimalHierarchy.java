import java.util.Scanner;
class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Mammal extends Animal {
    boolean hasFur;

    public Mammal(String name, int age, boolean hasFur) {
        super(name, age);
        this.hasFur = hasFur;
    }

    public void walk() {
        System.out.println(name + " is walking.");
    }
}
class Dog extends Mammal {
    String breed;
 public Dog(String name, int age, boolean hasFur, String breed) {
        super(name, age, hasFur);
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }
    public void displayInfo() {
        System.out.println("\nDog Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Has Fur: " + (hasFur ? "Yes" : "No"));
        System.out.println("Breed: " + breed);
    }
}
public class AnimalHierarchy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dog's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter dog's age: ");
        int age = scanner.nextInt();

        System.out.print("Does the dog have fur? (yes/no): ");
        boolean hasFur = scanner.nextBoolean();
        scanner.nextLine(); 

        System.out.print("Enter dog's breed: ");
        String breed = scanner.nextLine();

        // Creating Dog object with user input
        Dog myDog = new Dog(name, age, hasFur, breed);

        // Displaying information and calling methods
        myDog.displayInfo();
        myDog.eat();
        myDog.sleep();
        myDog.walk();
        myDog.bark();

        scanner.close();
    }
}
