import java.util.Scanner;
public class Shape {
    double length;
    double width;

    public Shape(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public Shape(double side) {
        this.length = side;
        this.width = side;
    }
    public double calculateArea() {
        return length * width;
    }
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for the first shape:");
        System.out.print("Enter length: ");
        double length1 = scanner.nextDouble();
        System.out.print("Enter width: ");
        double width1 = scanner.nextDouble();
        Shape shape1 = new Shape(length1, width1);

        System.out.println("\nEnter details for the second shape:");
        System.out.print("Enter side (for a square): ");
        double side2 = scanner.nextDouble();
        Shape shape2 = new Shape(side2);

        System.out.println("\nFirst Shape (Rectangle):");
        System.out.println("Area: " + shape1.calculateArea());
        System.out.println("Perimeter: " + shape1.calculatePerimeter());

        System.out.println("\nSecond Shape (Square):");
        System.out.println("Area: " + shape2.calculateArea());
        System.out.println("Perimeter: " + shape2.calculatePerimeter());

        scanner.close();
    }
}
