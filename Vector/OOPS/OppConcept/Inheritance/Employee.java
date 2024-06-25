public class Employee extends Person{

    private String employeeId;

    public Employee(String name, int age, String employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public void displayDetails(Person person) {
        super.displayDetails(person);
        System.out.println("Employee ID: " + employeeId);

    }

    public static void main(String[] args) {
        Person employee = new Employee("Mayuri Samanta", 25, "123456");
        employee.displayDetails(employee);
    }
}
