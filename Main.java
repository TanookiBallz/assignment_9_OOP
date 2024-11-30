import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeData employeeData = new EmployeeData();

        // 1. Create an Employee
        Employee newEmployee = new Employee("John Doe", "Developer", 75000.00, new Date());
        employeeData.createEmployee(newEmployee);
        System.out.println("New employee created and inserted into the database.");

        // 2. Retrieve Employee by ID
        Employee employee = employeeData.getEmployeeById(4);
        System.out.println("Employee Retrieved: " + employee);

        // 3. Retrieve All Employees
        System.out.println("All Employees: ");
        List<Employee> employees = employeeData.getAllEmployees();
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            for (Employee emp : employees) {
                System.out.println(emp);
            }
        }

        // 4. Update Employee
        if (employee != null) {
            employee.setName("Jane Doe");
            employee.setPosition("Senior Developer");
            employee.setSalary(80000.00);
            employeeData.updateEmployee(employee);
            System.out.println("Employee updated successfully!");
        }

        // 5. Retrieve All Employees After Update
        System.out.println("All Employees After Update: ");
        employees = employeeData.getAllEmployees();
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            for (Employee emp : employees) {
                System.out.println(emp);
            }
        }

        // 6. Delete Employee
        employeeData.deleteEmployee(2);
        System.out.println("Employee with ID 2 deleted.");

        // 7. Retrieve All Employees After Deletion
        System.out.println("All Employees After Deletion: ");
        employees = employeeData.getAllEmployees();
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            for (Employee emp : employees) {
                System.out.println(emp);
            }
        }
    }
}