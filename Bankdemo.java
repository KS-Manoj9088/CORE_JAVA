import java.util.Scanner;

// Base class RBI
class RBI {
    // Default interest rate set by RBI
    protected double interestRate = 4.0;

    public double getInterestRate() {
        return interestRate;
    }
}

// Derived class SBI
class SBI extends RBI {
    // Override interestRate for SBI
    // SBI can set its own interest rate, but it must be above the RBI minimum
    @Override
    public double getInterestRate() {
        // Assume SBI sets an interest rate of 5%
        return 5.0;
    }
}

// Derived class ICICI
class ICICI extends RBI {
    // Override interestRate for ICICI
    // ICICI can set its own interest rate, but it must be above the RBI minimum
    @Override
    public double getInterestRate() {
        // Assume ICICI sets an interest rate of 6%
        return 6.0;
    }
}

// Derived class PNB
class PNB extends RBI {
    // Override interestRate for PNB
    // PNB can set its own interest rate, but it must be above the RBI minimum
    @Override
    public double getInterestRate() {
        // Assume PNB sets an interest rate of 4.5%
        return 4.5;
    }
}

// Class to represent a customer
class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Class to represent an account
class Account {
    private Customer customer;
    private RBI bank;

    public Account(Customer customer, RBI bank) {
        this.customer = customer;
        this.bank = bank;
    }

    public void displayInterestRate() {
        System.out.println(customer.getName() + "'s Bank: " + bank.getClass());
        System.out.println("Interest Rate: " + bank.getInterestRate() + "%\n");
    }
}

public class Bankdemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create instances of customers
        Customer customer1 = new Customer("John");
        Customer customer2 = new Customer("Alice");

        // Create instances of different banks
        RBI rbi = new RBI();
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        PNB pnb = new PNB();

        // Create accounts for customers in different banks
        Account account1 = new Account(customer1, rbi);
        Account account2 = new Account(customer2, sbi);

        // Display interest rates for each account
        account1.displayInterestRate();
        account2.displayInterestRate();

        System.out.print("Enter the Bank name to find the rate of Interest: ");
        String bankName = scanner.nextLine().toUpperCase();

        // Demonstrate dynamic polymorphism
        switch (bankName) {
            case "RBI":
                Account accountRBI = new Account(customer1, rbi);
                accountRBI.displayInterestRate();
                break;
            case "SBI":
                Account accountSBI = new Account(customer1, sbi);
                accountSBI.displayInterestRate();
                break;
            case "ICICI":
                Account accountICICI = new Account(customer1, icici);
                accountICICI.displayInterestRate();
                break;
            case "PNB":
                Account accountPNB = new Account(customer1, pnb);
                accountPNB.displayInterestRate();
                break;
            default:
                System.out.println("Invalid bank name.");
        }

        scanner.close();
    }
}