/**
 * Write a Java program to calculate the salary of employees based on their base pay and hours worked.
 * - Ensure the program checks for minimum wage compliance (base pay should be at least $8.00).
 * - Limit the maximum hours worked to 60.
 * - Calculate overtime pay at 1.5 times the base pay for hours worked beyond 40.
 * - Display an error message if the base pay is below minimum wage or hours exceed 60.
 * - Test the program with sample data for multiple employees.
 */


public class Ps_002 {
    private double basePay;
    private int hoursWorked;

    // Default constructor
    public Ps_002() {
        this.basePay = 0.0;
        this.hoursWorked = 0;
    }

    // Parameterized constructor
    public Ps_002(double basePay, int hoursWorked) {
        this.basePay = basePay;
        this.hoursWorked = hoursWorked;
    }

    // Method to compute salary
    public void computeSalary() {
        // Minimum wage check
        if (basePay < 8.00) {
            System.out.println("Error: Base pay is below minimum wage.");
            return;
        }

        // Maximum hours check
        if (hoursWorked > 60) {
            System.out.println("Error: Hours worked exceed 60.");
            return;
        }

        double totalPay = 0.0;

        if (hoursWorked <= 40) {
            totalPay = hoursWorked * basePay;
        } else {
            int overtimeHours = hoursWorked - 40;
            totalPay = (40 * basePay) + (overtimeHours * basePay * 1.5);
        }

        System.out.printf("Total pay: $%.2f%n", totalPay);
    }

    public static void main(String[] args) {
        // Test cases
        Ps_002 employee1 = new Ps_002(7.50, 35);
        System.out.print("Employee 1: ");
        employee1.computeSalary();

        Ps_002 employee2 = new Ps_002(8.20, 47);
        System.out.print("Employee 2: ");
        employee2.computeSalary();

        Ps_002 employee3 = new Ps_002(10.00, 3);
        System.out.print("Employee 3: ");
        employee3.computeSalary();
    }
}
