public class StockPrice {
    public static void main(String[] args) {
        
        int[][] stock={
            {10,100},
            {11,120},
            {12,135},
            {1,140},
            {2,125},
            {3,145},
            {4,150},
            {5,152}
        };
        System.out.println("stock price at different times:");
        for(int i = 0;i<stock.length;i++){
        System.out.println("TIME: "  +  stock[i][0]+ " AM- stock value :"+ stock[i][1]);
        }
    }
    }
