import java.util.Scanner;

public class ClassQues3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0; 

        System.out.println("Enter the marks of each subject");
        System.out.println("1.DATA STRUCTURE:");
        int ds= sc.nextInt();

        System.out.println("2.MATHEMATICS:");
        int m= sc.nextInt();

        System.out.println("3.JAVA");
        int j=sc.nextInt();

        System.out.println("4.COMPUTER ORGANIZATION:");
        int co=sc.nextInt();

        System.out.println("5.AUTOCAD-G :");
        int au=sc.nextInt();

        System.out.println("total marks is 500"); 
        
        sum = ds+m+j+co+au;  
        System.out.println("obtained marks of students:" + sum);    

        if(420<sum){
            System.out.println("0-Grade");
        }
        if(420 < sum < 350){
            System.out.println("e grade");

        }
    }
    
}
