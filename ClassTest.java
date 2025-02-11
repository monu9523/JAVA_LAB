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
    }   
}


import java.util.Scanner;

public class BankAccount {
    // Fields
    String accountHolderName;
    int accountNumber;
    double balance;
    String accountType;

    // Constructor
    public BankAccount(String accountHolderName, int accountNumber, double balance, String accountType) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + ". New balance: $" + balance);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Method to transfer money
    public void transfer(BankAccount recipient, double amount) {
        if (amount <= balance) {
            balance -= amount;
            recipient.balance += amount;
            System.out.println("Transferred $" + amount + " to " + recipient.accountHolderName);
        } else {
            System.out.println("Insufficient balance to transfer!");
        }
    }

    // Display account details
    public void displayAccountDetails() {
        System.out.println("\nAccount Details:");
        System.out.println("Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("Account Type: " + accountType);
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking details for the first account
        System.out.println("Enter details for the first account:");
        System.out.print("Name: ");
        String name1 = scanner.nextLine();
        System.out.print("Account Number: ");
        int accountNumber1 = scanner.nextInt();
        System.out.print("Balance: ");
        double balance1 = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Account Type: ");
        String accountType1 = scanner.nextLine();

        BankAccount account1 = new BankAccount(name1, accountNumber1, balance1, accountType1);

        // Taking details for the second account
        System.out.println("\nEnter details for the second account:");
        System.out.print("Name: ");
        String name2 = scanner.nextLine();
        System.out.print("Account Number: ");
        int accountNumber2 = scanner.nextInt();
        System.out.print("Balance: ");
        double balance2 = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Account Type: ");
        String accountType2 = scanner.nextLine();

        BankAccount account2 = new BankAccount(name2, accountNumber2, balance2, accountType2);

        // Perform operations
        System.out.println("\nPerforming operations:");
        account1.displayAccountDetails();
        System.out.print("\nEnter deposit amount for " + account1.accountHolderName + ": ");
        double depositAmount = scanner.nextDouble();
        account1.deposit(depositAmount);

        System.out.print("\nEnter withdrawal amount for " + account1.accountHolderName + ": ");
        double withdrawalAmount = scanner.nextDouble();
        account1.withdraw(withdrawalAmount);

        System.out.print("\nEnter transfer amount from " + account1.accountHolderName + " to " + account2.accountHolderName + ": ");
        double transferAmount = scanner.nextDouble();
        account1.transfer(account2, transferAmount);

        // Display updated details
        System.out.println("\nUpdated Account Details:");
        account1.displayAccountDetails();
        account2.displayAccountDetails();

        scanner.close();
    }
}
