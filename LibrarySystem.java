import java.util.Scanner;
class LibraryItem {
    String title;
    boolean isCheckedOut;

    public LibraryItem(String title) {
        this.title = title;
        this.isCheckedOut = false;
    }
    public void checkOut() {
        if (!isCheckedOut) {
            isCheckedOut = true;
            System.out.println(title + " has been checked out.");
        } else {
            System.out.println(title + " is already checked out.");
        }
    }
    public void returnItem() {
        if (isCheckedOut) {
            isCheckedOut = false;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not checked out.");
        }
    }
}
class Book extends LibraryItem {
    public Book(String title) {
        super(title);
    }
}
class DVD extends LibraryItem {
    public DVD(String title) {
        super(title);
    }
}
class Journal extends LibraryItem {
    public Journal(String title) {
        super(title);
    }
}
public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter book title:");
        Book book = new Book(scanner.nextLine());

        System.out.println("Enter DVD title:");
        DVD dvd = new DVD(scanner.nextLine());

        System.out.println("Enter journal title:");
        Journal journal = new Journal(scanner.nextLine());

        while (true) {
            System.out.println("\nChoose an action:");
            System.out.println("1. Check out a book");
            System.out.println("2. Return a book");
            System.out.println("3. Check out a DVD");
            System.out.println("4. Return a DVD");
            System.out.println("5. Check out a journal");
            System.out.println("6. Return a journal");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();
               switch (choice) {
                case 1:
                    book.checkOut();
                    break;
                case 2:
                    book.returnItem();
                    break;
                case 3:
                    dvd.checkOut();
                    break;
                case 4:
                    dvd.returnItem();
                    break;
                case 5:
                    journal.checkOut();
                    break;
                case 6:
                    journal.returnItem();
                    break;
                case 7:
                    System.out.println("Exiting the system.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
