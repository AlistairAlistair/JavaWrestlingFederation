package people;

public class Employee extends People {
    private int employeeNumber;
    private int salary;

    public Employee(String name, int age, int employeeNumber, int salary) {
        super(name, age);
        this.employeeNumber = employeeNumber;
        this.salary = salary;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
