



public class Employee {

    int id;
    String firstName;
    String lastName;
    String address;

    public Employee() {
        this.id = 0;
        this.firstName = "";
        this.lastName = "";
        this.address = "";
    }

    public Employee(int id, String firstName, String lastName, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public static void main(String[] args) {
        Employee employee = new Employee(1, "Santhsoh", "Chary", "Siddipet");

        System.out.println("Full Name: " + employee.getFullName());
    }
}