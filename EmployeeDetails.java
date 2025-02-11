import java.util.Scanner;
class Employee {
    int id;
    String name;
    String department;
    double salary;

    void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("--------------------------");
    }
}
public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numberOfEmployees = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i < numberOfEmployees; i++) {
            Employee employee = new Employee();

            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.println("Enter Employee ID: ");
            employee.id = scanner.nextInt();
        
            System.out.println("Enter Name: ");
            employee.name = scanner.nextLine();

            System.out.println("Enter Department: ");
            employee.department = scanner.nextLine();

            System.out.println("Enter Salary: ");
            employee.salary = scanner.nextDouble();
            System.out.println("--------------------------");
 }
 scanner.close();
    }
}

