import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        System.out.println("\nArithmetic Operations:");
        System.out.println("Addition (num1 + num2): " + (num1 + num2));
        System.out.println("Subtraction (num1 - num2): " + (num1 - num2));
        System.out.println("Multiplication (num1 * num2): " + (num1 * num2));
        System.out.println("Division (num1 / num2): " + (num1 / num2));
        System.out.println("Modulus (num1 % num2): " + (num1 % num2));
        
        System.out.println("\nLogical Operations:");
        System.out.println("Logical AND (num1 > 0 && num2 > 0): " + (num1 > 0 && num2 > 0));
        System.out.println("Logical OR (num1 > 0 || num2 > 0): " + (num1 > 0 || num2 > 0));
        System.out.println("Logical NOT !(num1 > 0): " + !(num1 > 0));
        
        System.out.println("\nRelational Operations:");
        System.out.println("Equal (num1 == num2): " + (num1 == num2));
        System.out.println("Not Equal (num1 != num2): " + (num1 != num2));
        System.out.println("Greater Than (num1 > num2): " + (num1 > num2));
        System.out.println("Less Than (num1 < num2): " + (num1 < num2));
        System.out.println("Greater Than or Equal (num1 >= num2): " + (num1 >= num2));
        System.out.println("Less Than or Equal (num1 <= num2): " + (num1 <= num2));
        sc.close();
    }
}
