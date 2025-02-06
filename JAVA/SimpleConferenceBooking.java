import java.util.ArrayList;
import java.util.Scanner;

class RoomBooking {
    String date;
    int start, end;
    String name;

    RoomBooking(String date, int start, int end, String name) {
        this.date = date;
        this.start = start;
        this.end = end;
        this.name = name;
    }
}
public class SimpleConferenceBooking {
    static ArrayList<RoomBooking> bookings = new ArrayList<>();
    static boolean isAvailable(String date, int start, int end) {
        for (RoomBooking b : bookings) {
            if (b.date.equals(date) && !(end <= b.start || start >= b.end)) {
                return false; 
            }
        }
        return true;
    }
 static void bookRoom(String date, int start, int end, String name) {
        if (isAvailable(date, start, end)) {
            bookings.add(new RoomBooking(date, start, end, name));
            
            System.out.println(" Booking confirmed for " + name);
        } else {
            System.out.println("Sorry,Room is not available at this time.");
        }
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter Date (YYYY-MM-DD) or 'exit' to stop: ");
            String date = sc.next();
            if (date.equalsIgnoreCase("exit")) break;

            System.out.print("Enter Start Time (24-hour format): ");
            int start = sc.nextInt();
            System.out.print("Enter End Time (24-hour format): ");
            int end = sc.nextInt();
            System.out.print("Enter Your Name: ");
            String name = sc.next();

            bookRoom(date, start, end, name);
        }
        sc.close();
    }
}

