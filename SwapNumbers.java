import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter num 1: ");
        int a = sc.nextInt();
        System.out.println("enter num 2: ");
        int b = sc.nextInt();

        System.out.println("swap number using third variable:");
        int temp= a;
        a = b;
        b = temp;
        System.out.println("first number after swap:" +a);
        System.out.println("second number after swap:" +b);

        System.out.println("swap without third variable:");
        a = a+b;
        b=a-b;
        a=a-b;
        System.out.println("firdt number after swap:" +a);
        System.out.println("second number after swap:" +b);
        sc.close();
    }
}
