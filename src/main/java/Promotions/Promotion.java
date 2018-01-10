package Promotions;
import people.Employee;
import people.Wrestler;

import java.util.ArrayList;

public class Promotion {
    private String name;
    private String location;
    private ArrayList<Employee> employees;

    public Promotion(String name, String location) {
        this.name = name;
        this.location = location;
        this.employees = new ArrayList<Employee>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public int numberOfEmployees() {
        return this.employees.size();
    }

    public void addEmployeeToPromotion(Employee employee) {
        this.employees.add(employee);
    }
}
