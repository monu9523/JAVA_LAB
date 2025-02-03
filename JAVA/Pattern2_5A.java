import java.util.Scanner;

public class Pattern2_5A {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number of levels: ");
        int levels = sc.nextInt();

        System.out.println("(PATTERN 1)");
        for (int i = 1; i <= levels; i++) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}