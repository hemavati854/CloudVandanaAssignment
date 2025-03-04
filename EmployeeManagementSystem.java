import java.util.ArrayList;
import java.util.List;

class Employee {
    // Attributes of the Employee class
    int id;
    String name;
    double salary;

    // Constructor to initialize Employee object
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println();
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating Employee objects
        Employee employee1 = new Employee(1, "Hema", 500912.43);
        Employee employee2 = new Employee(2, "Durga", 1203480.90);
        Employee employee3 = new Employee(3, "Devi", 1598620.32);

        // Storing Employee objects in a list
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        // Displaying employee details
        for (Employee emp : employeeList) {
            emp.displayDetails();
        }
    }
}
