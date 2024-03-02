import java.util.Scanner;

// Base class Employee
class Employee {
    protected String employeeId;

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    public void displaySalaryDetails() {
        System.out.println("Salary Details for Employee " + employeeId + ":");
    }
}

// Derived class RegularEmployee
class RegularEmployee extends Employee {
    private double basicPay = 25000.0;
    private double hra = 15000.0;
    private double ta = 5000.0;

    public RegularEmployee(String employeeId) {
        super(employeeId);
    }

    @Override
    public void displaySalaryDetails() {
        super.displaySalaryDetails();
        System.out.println("Basic Pay: " + basicPay + "\tHRA: " + hra + "\tT.A: " + ta +
                           "\tTotal Amount: " + (basicPay + hra + ta));
    }
}

// Derived class ContractEmployee
class ContractEmployee extends Employee {
    private double basicPay = 12000.0;
    private double ta = 3000.0;

    public ContractEmployee(String employeeId) {
        super(employeeId);
    }

    @Override
    public void displaySalaryDetails() {
        super.displaySalaryDetails();
        System.out.println("Basic Pay: " + basicPay + "\tT.A: " + ta +
                           "\tTotal Amount: " + (basicPay + ta));
    }
}

public class SalaryDetailsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee Id: ");
        String employeeId = scanner.nextLine();

        System.out.print("Enter Employee Type (Regular or Contract): ");
        String employeeType = scanner.nextLine().toLowerCase();

        Employee employee;

        if (employeeType.equals("regular")) {
            employee = new RegularEmployee(employeeId);
        } else if (employeeType.equals("contract")) {
            employee = new ContractEmployee(employeeId);
        } else {
            System.out.println("Invalid Employee Type.");
            scanner.close();
            return;
        }

        employee.displaySalaryDetails();

        scanner.close();
    }
}