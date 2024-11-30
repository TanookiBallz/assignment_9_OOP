# Employee Management System

## Description of the Project
The Employee Management System is a Java-based application designed to manage employee records in a relational database. It provides the ability to perform CRUD (Create, Read, Update, Delete) operations on employee data stored in a MySQL database. The application interacts with the database using JDBC and demonstrates proper use of object-oriented programming principles such as encapsulation and abstraction.

### Key Features:
- Add new employees to the database.
- Retrieve employee details by ID.
- Retrieve all employees from the database.
- Update existing employee details.
- Delete employees from the database.

---

## Instructions to Run the Program

### Prerequisites:
1. **Java JDK 21** or later installed on your system.
2. **MySQL Server** installed and running.
3. MySQL **JDBC Connector** (e.g., `mysql-connector-j-9.1.0.jar`) downloaded and added to the project.

### Step-by-Step Guide:

1. **Database Setup**:
   - Create a new database named `employee_db` using the following command:
     ```sql
     CREATE DATABASE employee_db;
     ```
   - Use the database and create the `employee` table:
     ```sql
     USE employee_db;

     CREATE TABLE employee (
         id INT AUTO_INCREMENT PRIMARY KEY,
         name VARCHAR(100),
         position VARCHAR(100),
         salary DOUBLE,
         hire_date DATE
     );
     ```

2. **Configure the Project**:
   - Clone or download this repository and open it in your IDE (e.g., IntelliJ IDEA).
   - Add the MySQL JDBC connector to your project's classpath.
   - Update the database connection details in `EmployeeData.java`:
     ```java
     private static final String URL = "jdbc:mysql://localhost:3306/employee_db";
     private static final String USER = "root";
     private static final String PASSWORD = "yourpassword";
     ```

3. **Run the Program**:
   - Open the `Main.java` file and run the `main()` method to test all CRUD operations.
   - Observe the console output to see the operations in action.

### Example Output:
```plaintext
New employee created and inserted into the database.
Employee Retrieved: Employee{id=1, name='John Doe', position='Developer', salary=75000.0, hireDate=2024-11-24}
All Employees:
Employee{id=1, name='John Doe', position='Developer', salary=75000.0, hireDate=2024-11-24}
Employee updated successfully!
Employee with ID 1 deleted.
All Employees After Deletion:
No employees found.