import java.util.Scanner;

public class PatternPrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of lines for the pattern: ");
        int n = scanner.nextInt();

        for (int i = n; i >= 1; i--) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
