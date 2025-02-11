import java.util.Scanner;
public class NumToBin {
    public static String toBinary(int number) {
        StringBuilder binary = new StringBuilder();
        while (number > 0) {
            binary.insert(0, number % 2);
            number /= 2;
        }
        return binary.length() > 0 ? binary.toString() : "0";
    }
    public static String toHexadecimal(int number) {
        StringBuilder hex = new StringBuilder();
        char[] hexChars = {'0', '1', '2', '3', '4', '5', 
        '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (number > 0) {
            hex.insert(0, hexChars[number % 16]);
            number /= 16;
        }
        return hex.length() > 0 ? hex.toString() : "0";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = scanner.nextInt();

        String binary = toBinary(number);
        String hexadecimal = toHexadecimal(number);

        System.out.println("Binary: " + binary);
        System.out.println("Hexadecimal: " + hexadecimal);

        scanner.close();
    }
}