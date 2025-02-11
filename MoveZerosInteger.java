import java.util.Scanner;
public class MoveZerosInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long num = sc.nextLong(); 
        long result = 0, multiplier = 1;
        int zeroCount = 0;

        while (num > 0) {
            int digit = (int) (num % 10);
            if (digit == 0) {
                zeroCount++; 
            } else {
                result = digit * multiplier + result; 
                multiplier *= 10;
            }
            num /= 10;
        }
        while (zeroCount-- > 0) {
            result *= 10;
        }
        System.out.println("Output: " + result);
        sc.close();
    }
}
