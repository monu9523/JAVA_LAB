import java.util.Scanner;
public class StarPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of lines:");
        int n = sc.nextInt(); 

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) { 
                System.out.println("*");
            } 
            else { 
                for (int j = 1; j <= 2 * (i / 2) - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
