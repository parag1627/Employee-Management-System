import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creating Employee objects
        Employee emp1 = new Employee(101, "Manish", 50000);
        Employee emp2 = new Employee(102, "Virat", 60000);
        Employee emp3 = new Employee(103, "Rohit", 70000);

        // Storing employees in a list
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        // Displaying employee details
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
