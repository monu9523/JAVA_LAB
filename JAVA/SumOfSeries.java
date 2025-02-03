import java.util.Scanner;
public class SumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of times:");
        int n= sc.nextInt();

        double sum=1.0;
        for(int i=1;i<n;i++){
            sum=sum+1.0/Math.pow(2, i);
        }
        System.out.println("sum of the term given:" +sum);
        sc.close();
    }
    
}
