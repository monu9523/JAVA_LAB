import java.util.Scanner;
public class EvenOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();

        int evensum=0;
        int oddsum=0;
         
        while( n > 0 ){
            int digit = n % 10;
            if(digit % 2==0){
                evensum = evensum+digit;
            }
            else{
                oddsum= oddsum+digit;
            }
            n=n/10;

        }
        System.out.println("Sum of odd digits is " + oddsum);
        System.out.println("Sum of even digits is " + evensum);

        }


        
    }
    


