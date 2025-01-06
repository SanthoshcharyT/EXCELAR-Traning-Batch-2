/*2. Create a class PartTimeEmployee which is extending from Employee class and implement the following:

a) Instance variables

• hours Worked

amountPerHour

b) Generate Constructors (default & parameterised)

c) Create a method (computeSal()) to calculate the salary based on working hours

d) Create a method showDetails() to display the details of PartTimeEmployee 

*/

package problemstatement;

class Employee {
    protected String name;
    protected int id;

    public Employee() {
        this.name = "Unknown";
        this.id = 0;
    }

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

public class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double amountPerHour;

    public PartTimeEmployee() {
        super();
        this.hoursWorked = 0;
        this.amountPerHour = 0.0;
    }

    public PartTimeEmployee(String name, int id, int hoursWorked, double amountPerHour) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.amountPerHour = amountPerHour;
    }

    public double computeSal() {
        return hoursWorked * amountPerHour;
    }

    public void showDetails() {
        System.out.println("Part-Time Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Amount Per Hour: " + amountPerHour);
        System.out.println("Salary: " + computeSal());
    }

    public static void main(String[] args) {
        PartTimeEmployee emp = new PartTimeEmployee("Santhosh CharyS", 647, 20, 15.5);
        emp.showDetails();
    }
}
