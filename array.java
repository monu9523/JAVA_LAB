public class array {
    public static void main(String[] args) {
        {
         /*int x[][]=new int[3][3];//2d array only column does not allow[][8]   
                       // int x[]= new int[9]; one dimentional  
                           // int x[]={5,6,9,9};
            for(int i=0;i<x.length;i++)
            {
                System.out.println(x[i]);*/
                int x[][]=new int[4][];
                /*System.out.println(x.length);//show row only
                System.out.println(x[0].length);//show column only
                System.out.println(x.length*x[0].length);//show no of element*/
x[0]=new int[8];
x[1]=new int[7];
x[2]=new int[6];
x[3]=new int[5];

                for (int i = 0; i < x.length; i++) {
                    for(int j=0;j<x[i].length;j++)
                    {
                        x[i][j]=i+j;
                        System.out.println(x[i][j]+"\t");
                    }
                    System.out.println("");
                }

            }
        }
    }
    

