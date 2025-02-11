import java.util.HashMap;
public class Frequency {
    public static void main(String[] args) {
        
        int arr[] = {3,5,1,12,3,20,1,3,20,12,1,10,3,12,20};
        HashMap<Integer , Integer> freq = new HashMap<>();
        for(int num : arr){
            freq.put(num , freq.getOrDefault(num, 0)+1);
        }
        System.out.println("frequency of element : ");
        freq.forEach((key,value) -> System.out.println(key + "  ->" + value));
    }
    }
