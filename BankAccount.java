import java.util.Scanner;
public class BankAccount{
    String Name;
    int acc_no ;
    double balance;
    String acc_type;

    public BankAccount(String Name,int acc_no,double balance,String acc_type) {
        this.Name = Name;
        this.acc_no = acc_no;
        this.balance=balance;
        this.acc_type= acc_type;
}
public void deposit(double amount){
    balance += amount;
    System.out.println("Money deposited in your account!!!");
}
public void withdrawal(double amount){
    if(amount<=balance){
    balance -= amount;
    System.out.println("withdrew amount:$ "+ amount + "new balance :$" + balance);
}else{
    System.out.println("insufficient balance  !!!!");
}
}
public void displayAccountDetails(){
    System.out.println("account holder name :" + Name);
    System.out.println("account number :"+acc_no);
    System.out.println("Balance in account");
    System.out.println("account type :"+ acc_type);
}
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);

    System.out.println("enter the account holder name:");
    String Name = sc.nextLine();

    System.out.println("enter account number:");
    int acc_no = sc.nextInt();

    System.out.println(" show balance:");
    double balance = sc.nextDouble();

    System.out.println("account type :");
    String acc_type =sc.nextLine();
}
}
