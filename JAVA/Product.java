import java.util.Scanner;
public class Product {
     
    String productname ;
    int product_id;
    float price;
    int qty_in_stock;
    
    public Product(String productname,int product_id,float price,int qty_in_stock) {
            this.productname = productname;
            this.product_id =product_id;
            this.price=price;
            this.qty_in_stock= qty_in_stock;
 }
 public void apply_discount(double discount){
    if(discount > 0 && discount <=100)
    {
        price-=(price * discount) / 100;
        System.out.println("Discount applied ! Here new price :$"+ price);
    }else{
        System.out.println("DISCOUNT not applied !!!");
    }
 }
 public void displayProductDetails(){
    System.out.println("Name: " + productname);
    System.out.println("Id: "+ product_id);
    System.out.println("Price :$ " + price);
    System.out.println("In Stock: " + qty_in_stock);
 }
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the product name:");
    String productname = sc.nextLine();

    System.out.println("Product ID:");
    int product_id = sc.nextInt();

    System.out.println("Price of the product:");
    float price = sc.nextFloat();

    System.out.println("Quantity available in stock:");
    int qty_in_stock = sc.nextInt();

    Product product = new Product(productname, product_id, price, qty_in_stock);
    product.displayProductDetails();
    System.out.print("\nEnter discount percentage: ");
        double discount = sc.nextDouble();
        product.apply_discount(discount);
        product.displayProductDetails();

        sc.close();
    
 }
}
