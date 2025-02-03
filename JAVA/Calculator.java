import java.util.Scanner;
class Number {
    private double value;
    public Number(double value) {
        this.value = value;
    }
    public double getValue() {
        return value;
    }
    public double add(Number other) {
        return this.value + other.getValue();
    }
    public double subtract(Number other) {
        return this.value - other.getValue();
    }
    public double multiply(Number other) {
        return this.value * other.getValue();
    }
    public double divide(Number other) {
        if (other.getValue() == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return this.value / other.getValue();
    }
}// Main class to use the Number class
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();
        Number number1 = new Number(num1);
        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();
        Number number2 = new Number(num2);
        System.out.println("Choose an operation: +, -, *, /");
        char operation = scanner.next().charAt(0);
        double result = 0.0;
        try {
            switch (operation) {
                case '+':
                    result = number1.add(number2);
                    break;
                case '-':
                    result = number1.subtract(number2);
                    break;
                case '*':
                    result = number1.multiply(number2);
                    break;
                case '/':
                    result = number1.divide(number2);
                    break;
                default:
                    System.out.println("Invalid operation. Please choose +, -, *, or /.");
                    return;
            }
            System.out.println("The result is: " + result);
    } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
     scanner.close();
    }
}
