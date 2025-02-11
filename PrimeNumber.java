import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter lower limit X:");
       int x = sc.nextInt();
       System.out.println("enter upper limit Y:");
       int y = sc.nextInt();
       System.out.println("enter the prime number N:");
       int n= sc.nextInt();

       int count=0;
       int num=x;
       System.out.println("Prime number:");

       while (count < n) {
        if(isPrimeNumber(num)) {
            System.out.print(num + " ");
            count++;
        }
        num++;
    }

    sc.close();
}
 }
 