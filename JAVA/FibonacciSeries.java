import java.util.Scanner;
public class FibonacciSeries {
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
    public static void fibonacciNonRecursive(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci series: " + a);
        for (int i = 1; i < n; i++) {
            System.out.print(", " + b);
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    } public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int terms = sc.nextInt();

        System.out.println("Using non-recursive method:");
        fibonacciNonRecursive(terms);

        System.out.println("Using recursive method:");
        System.out.print("Fibonacci series: ");
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacciRecursive(i) + (i < terms - 1 ? ", " : "\n"));
        }

        sc.close();
    }
}