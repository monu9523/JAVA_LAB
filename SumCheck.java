import java.util.Scanner;

public class SumCheck {

    public static int calculateDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
         return sum == originalNum;
    }
    public static boolean isPerfect(int num) {
        if (num <= 0) return false;
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int inputNumber = sc.nextInt();

        int digitSum = calculateDigitSum(inputNumber);
        System.out.println("Sum is: " + digitSum);
        System.out.println("Prime: " + (isPrime(digitSum) ? "Y" : "N"));

        System.out.println("Armstrong: " + (isArmstrong(digitSum) ? "Y" : "N"));

        System.out.println("Perfect: " + (isPerfect(digitSum) ? "Y" : "N"));

        sc.close();
    }
}
