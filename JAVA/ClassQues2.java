
public class ClassQues2 {
    public static void main(String[] args) {
        int x[]={4,2,10,23,1,45,89,100,};

        int min=x[0];
        int max=x[0];
    for(int i = 0; i < x.length; i++){
    if(x[i]<min){
     min = x[i];
                }
    if(x[i]>max){
    max=x[i];
                }
}
System.out.println("minimum element of array:"+ min);
System.out.println("maximum element of array is:" + max);
     }
}
