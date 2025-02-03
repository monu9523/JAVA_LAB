import java.io.IOException;
import java.util.Scanner;

public class ClassTest {

    public static void main (String[] args)throws IOException {  //or exception
        {
          /*   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            char gender = (char)br.read();
            System.out.println(gender);
             //int age= Integer.parseInt(br.readLine());
            // System.out.println(age);
           //String str = br.readLine();*/
            Scanner sc = new Scanner(System.in); 
        int age = sc.nextInt();
    String name = sc.nextLine();
float mark = sc.nextFloat();
System.out.println(age);       }
System.out.println("name");
System.out.println(mark);

        
    }

    
}
