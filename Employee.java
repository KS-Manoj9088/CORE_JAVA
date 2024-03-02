public class Employee {
    private String name;
    private int id;
    private String designation;
    private double salary;
    private boolean promotionStatus;

    // Constructor for regular employees
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.designation = "Employee";
        this.salary = salary;
        this.promotionStatus = false;
    }

    // Constructor for managers
    public Employee(String name, int id, double salary, boolean promotionStatus)
	{
        this.name = name;
        this.id = id;
        this.designation = "Manager";
        this.salary = salary;
        this.promotionStatus = promotionStatus;
    }

    // Constructor for executives
    public Employee(String name, int id, double salary, boolean promotionStatus, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
        this.promotionStatus = promotionStatus;
    }

    // Getter methods (not included in the original question)
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    public boolean getPromotionStatus() {
        return promotionStatus;
    }

    public static void main(String[] args) {
        // Example usage of the Employee class with different constructors
        Employee regularEmployee = new Employee("John Doe", 1001, 50000.0);
        Employee manager = new Employee("Jane Smith", 2001, 80000.0, true);
        Employee executive = new Employee("Robert Johnson", 3001, 120000.0, true, "Executive");

        // Displaying employee information
        displayEmployeeInformation(regularEmployee);
        displayEmployeeInformation(manager);
        displayEmployeeInformation(executive);
    }

    // Method to display employee information 
    private static void displayEmployeeInformation(Employee employee) {
        System.out.println("Employee Information:");
        System.out.println("Name: " + employee.getName());
        System.out.println("ID: " + employee.getId());
        System.out.println("Designation: " + employee.getDesignation());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Promotion Status: " + employee.getPromotionStatus());
        System.out.println();
    }
}