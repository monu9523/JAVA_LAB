import java.util.Scanner;
public class MinProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int smallest = 9, secondSmallest = 9;
        while (num > 0) {
            int digit = num % 10;
            
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest) {
                secondSmallest = digit;
            }

            num /= 10;
        }
        System.out.println("Output: " + (smallest * secondSmallest)); 
        sc.close();
    }
}

